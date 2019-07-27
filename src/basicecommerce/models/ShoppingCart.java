/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicecommerce.models;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class ShoppingCart {

    public ShoppingCart() {
    }

    private Map<Product, Integer> _products = new HashMap<>();

    public Map<Product, Integer> getProducts() {
        return _products;
    }

    public void setProducts(Map<Product, Integer> _products) {
        this._products = _products;
    }

    public void addProduct(Product prod, int amount) {
        Integer amountProd = _products.get(prod);
        amountProd = amountProd != null ? amountProd + amount : amount;
        _products.put(prod, amountProd);
    }

    public void removeProduct(Product prod, int amount) {
        Integer amountProd = _products.get(prod);
        if (amountProd == null) {
            return;
        }
        amountProd -= amount;
        if (amountProd <= 0) {
            _products.remove(prod);
        } else {
            _products.put(prod, amountProd);
        }
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Product, Integer> prodAmount : _products.entrySet()) {
            Product product = prodAmount.getKey();
            int amount = prodAmount.getValue();
            totalPrice += product.getPrice() * amount;
        }
        return totalPrice;
    }

}
