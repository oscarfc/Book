/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercato;

import java.util.Comparator;

/**
 *
 * @author oscar.favero
 * 
 */
public class OrdinaPerPrezzo implements Comparator<Product> {
    @Override
    public int compare(Product p0, Product p1) {
        return p0.getPrezzo() < p1.getPrezzo() ? -1 : 
                p0.getPrezzo() > p1.getPrezzo() ? 1 : 0;
    }
}
