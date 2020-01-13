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
    private static int indice = 1;

    public Book() {
        libro = new TreeMap<>();
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Book b = new Book(); 
        b.addChapter("Prefazione", "Sono passati pochi anni..."); 
        b.addChapter("Introduzione", "Un calcolatore digitale...") ; 
        b.addChapter("Sistemi di elaborazione", "Un calcolatore");
        
        Book bb = (Book)b.clone(); 
        System.out.println(bb.getChapterContent(1)); 
        System.out.println(bb.getChapterTitle(2));
    }

    private void addChapter(String titolo, String capitolo) {        
        libro.put(indice++, new Chapter(titolo, capitolo));
    }

    private String getChapterContent(int i) {
        return libro.get(i).getChapterContent();
    }

    private String getChapterTitle(int i) {
        return libro.get(i).getChapterName();
    }
}
