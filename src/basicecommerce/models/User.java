/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicecommerce.models;

/**
 *
 * @author admin
 */
public class User {

    private String _name;
    private String _email;
    private ShoppingCart _sc;

    public User(String _name, String _email) {
        this._name = _name;
        this._email = _email;
        this._sc = new ShoppingCart();
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public ShoppingCart getSc() {
        return _sc;
    }

    public void setSc(ShoppingCart _sc) {
        this._sc = _sc;
    }
    
    public void addProduct(Product prod, int amount) {
        _sc.addProduct(prod, amount);
    }
    
    public void removeProduct(Product prod, int amount) {
        _sc.removeProduct(prod, amount);
    }
    
    public double getTotalPrice() {
        return _sc.totalPrice();
    }
    
}
