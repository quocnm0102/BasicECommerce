
import basicecommerce.models.Product;
import basicecommerce.models.User;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Testor {
    public static void main(String[] args) {
        testCase1();
        testCase2();
    }
    
    public static void testCase1() {
        User user = new User("John Doe", "john.doe@example.com");
        Product apple = new Product("Apple", 4.95);
        Product orange = new Product("Orange", 3.99);
        user.addProduct(apple, 2);
        user.addProduct(orange, 1);
        double totalPrice = user.getTotalPrice();
        assert (totalPrice == 13.89);
    }
    
    public static void testCase2() {
        User user = new User("John Doe", "john.doe@example.com");
        Product apple = new Product("Apple", 4.95);
        user.addProduct(apple, 3);
        user.removeProduct(apple, 1);
        double totalPrice = user.getTotalPrice();
        assert (totalPrice == 9.9);
    }
}
