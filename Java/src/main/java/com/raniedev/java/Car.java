/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
public class Car implements Comparable {
    public String brand;
    public String model;
    public int year;
    
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
  
    @Override
    public int compareTo(Object obj) {
        Car other = (Car)obj;
        if(year < other.year) return -1;
        if(year > other.year) return 1;
        return 0;
    }
    
}
