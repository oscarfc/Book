/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segmenti;

/**
 *
 * @author oscar.favero
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Segmento s1 = new Segmento(0.0, -3.0, 4.0, 0.0);
        Segmento s2 = new Segmento(4.0, 0.0, 0.0, -3.0);
        Segmento s3 = (Segmento) s2.clone();
        System.out.println(s1.equals(s2));
        System.out.println(s1.getDistance());
    }
}
