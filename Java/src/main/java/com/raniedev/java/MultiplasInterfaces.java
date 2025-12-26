/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
public class MultiplasInterfaces implements InterfaceUm, InterfaceDois {
    @Override
    public void metodoUm(){
        System.out.println("Primeiro método de uma chamada de múltiplas interfaces.");
    }
    
    @Override
    public void metodoDois(){
        System.out.println("Segundo método de uma chamada de múltiplas interfaces.");
    }
}
