/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercato;

import java.util.Iterator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

/**
 *
 * @author oscar.favero
 */
public class Product implements Comparable<Product> {

    private final String descrizione;
    private final double prezzo;
    private static SortedSet<Product> prodotti = new ConcurrentSkipListSet<>((Product p0, Product p1)
            -> p0.getDescrizione().compareTo(p1.getDescrizione()));
//    private static SortedSet<Product> prodotti = new ConcurrentSkipListSet<>(new Comparator<Product>() {
//        @Override
//        public int compare(Product p0, Product p1) {
//            return p0.getDescrizione().compareTo(p1.getDescrizione());
//        }
//    });

    public Product(String descrizione, double prezzo) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        boolean add = prodotti.add(this);
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.descrizione);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.prezzo) ^ (Double.doubleToLongBits(this.prezzo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (Double.doubleToLongBits(this.prezzo) != Double.doubleToLongBits(other.prezzo)) {
            return false;
        }
        if (!Objects.equals(this.descrizione, other.descrizione)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "descrizione=" + descrizione + ", prezzo=" + prezzo + '}';
    }

    public static String getMostExpensive() {
        String ret = null;
//        Collections.sort(prodotti, new Comparator<Product> (){
//                @Override
//                public int compare(Product p0, Product p1) {
//                    return p0.getPrezzo() < p1.getPrezzo() ? 1
//                        : p0.getPrezzo() > p1.getPrezzo() ? -1 : 0;
//    }});

//        Collections.sort(prodotti, (Product p0, Product p1) -> {
//            return  p0.getPrezzo() < p1.getPrezzo() ? 1
//                    : p0.getPrezzo() > p1.getPrezzo() ? -1 : 0;
//        });
//        Collections.sort(prodotti,
//                Product::comparaPrezzo);
//        ret = prodotti.get(0).getDescrizione() + " , " + prodotti.get(0).getPrezzo();
   SortedSet<Product> prezzi = new ConcurrentSkipListSet<>((Product p0, Product p1)
                -> p0.getPrezzo() > p1.getPrezzo() ? -1 : p0.getPrezzo() < p1.getPrezzo() ? 1 : 0);
    prezzi.addAll (prodotti);
    ret  = prezzi.first().getDescrizione() + " , " + prezzi.first().getPrezzo();
    return ret ;
}

@Override
public int compareTo(Product c) {
        return this.getDescrizione().compareTo(c.getDescrizione());
    }

    public static int comparaPrezzo(Product p0, Product p1) {
        return p0.getPrezzo() < p1.getPrezzo() ? 1
                : p0.getPrezzo() > p1.getPrezzo() ? -1 : 0;
    }

    public void stampaProdotti() {
       for (Iterator<Product> it = prodotti.iterator(); it.hasNext();) {
           System.out.println(((Product)it.next()).toString());
       }
       
     }

    private void stampa() {
        System.out.println(descrizione + " ," + prezzo);
    }
}
