/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
public class UsarInterface implements Interface {

    @Override
    public void sound() {
        System.out.println("Fazendo barulho");
    }

    @Override
    public void run() {
        System.out.println("Correndo...");
    }
    
}
