/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicecommerce;

import basicecommerce.models.Product;
import basicecommerce.models.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class App {

    public static void main(String[] args) {
        runJar(args);
    }

    public static void runJar(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                runTest(args[i]);
            } catch (IOException ex) {
                System.out.println(String.format("File %s invalid", args[i]));
            }
        }
    }

    public static void runTest(String path) throws IOException {
        File file = new File(path);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int countProdInfo = 0;
        String username = br.readLine();
        String email = br.readLine();
        User user = new User(username, email);
        String[] prodInfo = new String[3];
        while ((st = br.readLine()) != null) {
            prodInfo[countProdInfo] = st;
            if (countProdInfo == 2) {
                Product product = new Product(prodInfo[0], Double.valueOf(prodInfo[1]));
                int amount = Integer.parseInt(prodInfo[2]);
                if (amount <= 0) {
                    user.removeProduct(product, Integer.parseInt(prodInfo[2]));
                } else {
                    user.addProduct(product, Integer.parseInt(prodInfo[2]));
                }
                countProdInfo = 0;
                prodInfo = new String[3];
            } else {
                ++countProdInfo;
            }
        }
        System.out.println(String.format("%.2f", user.getTotalPrice()));
    }

    public static void testCase1() {
        User user = new User("John Doe", "john.doe@example.com");
        Product apple = new Product("Apple", 4.95);
        Product orange = new Product("Orange", 3.99);
        user.addProduct(apple, 2);
        user.addProduct(orange, 1);
        double totalPrice = user.getTotalPrice();
        System.out.println(totalPrice);
    }

    public static void testCase2() {
        User user = new User("John Doe", "john.doe@example.com");
        Product apple = new Product("Apple", 4.95);
        Product apple2 = new Product("Apple", 4.95);
        user.addProduct(apple, 3);
        user.removeProduct(apple2, 1);
        double totalPrice = user.getTotalPrice();
        System.out.println(totalPrice);
    }

    public static void testCase3() {
        User user = new User("John Doe", "john.doe@example.com");
        Product apple = new Product("Apple", 4.95);
        Product apple2 = new Product("Apple", 5);
        user.addProduct(apple, 3);
        user.removeProduct(apple2, 1);
        double totalPrice = user.getTotalPrice();
        System.out.println(totalPrice);
    }

}
