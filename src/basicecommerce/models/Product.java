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
public class Product {

    private String _name;
    private double _price;

    public Product(String _name, double _price) {
        this._name = _name;
        this._price = _price;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double _price) {
        this._price = _price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return (product._name == this._name && product._price == this._price);
    }
}
