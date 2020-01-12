/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.book;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author oscar.favero
 */
public class Book implements Cloneable {
    private final SortedMap<Integer, Chapter> libro;

    public Book() {
        libro = new TreeMap<>();
    }
    
}
