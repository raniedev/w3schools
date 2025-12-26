/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
public class PolimorfismoPai {
    String type = "Father";
            
    public void msg(){
        System.out.println("Pai.");
    }
    
    public void goodbye(){
        System.out.println("Adeus...");
    }
    
    PolimorfismoPai(){
        System.out.println("Pai criado");
    }
}
