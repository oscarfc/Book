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
public class Segmento implements Cloneable {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Segmento(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

   
    @Override
    public String toString() {
        return "Segmento{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.x1) ^ (Double.doubleToLongBits(this.x1) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.y1) ^ (Double.doubleToLongBits(this.y1) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.x2) ^ (Double.doubleToLongBits(this.x2) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.y2) ^ (Double.doubleToLongBits(this.y2) >>> 32));
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
        final Segmento other = (Segmento) obj;
        if (this.x1 != other.x1 && this.x2 != other.x1) {
            return false;
        }
        if (this.y1 != other.y1 && this.y2 != other.y1) {
            return false;
        }
        if (this.x2 != other.x2 && this.x2 != other.x1) {
            return false;
        }
        if (this.y2 != other.y2 && this.y2 != other.y1) {
            return false;
        }
        return true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    public double getDistance() {
        double distanza = Math.sqrt((this.x2 - this.x1) + (this.y2 - this.y1));
        double areaDoppia = (this.x1 * this.y2 - this.x2 * this.y1);        
        return (areaDoppia / distanza);
    }
}
