/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercato;

/**
 *
 * @author oscar.favero
 */
public class GestioneSuper {

    public static void main(String[] args) {
        Product a = new Product("Sale", 0.60);
        Product b = new Product("Zucchero", 0.95);
        Product x = new Product("Burro", 1.94);
        Product c = new Product("Caffe'", 2.54);
        c.stampaProdotti();
        System.out.println(Product.getMostExpensive());

        Product d = new Product("Farina", 1.04);
        Product e = new Product("Gin", 8.50);
        Product f = new Product("Tazza", 1.50);
        Product g = new Product("Bicchiere", 1.50);
        Product h = new Product("Yogurt", 1.20);
        Product l = new Product("Anguria", 1.0); 

        System.out.println(Product.getMostExpensive());
        System.out.println(b.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println(e.compareTo(c));
        a.stampaProdotti();
    }
}
