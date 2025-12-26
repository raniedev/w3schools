/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */

//Esta é uma superclasse (pai) a partir do momento que for declarada posteriomente a um extends
public class ClassePai {
    protected String nome = "Variável nome na classe pai";
    public void honk(){
        System.out.println("Método da classe pai");
    }
    
    public String getParentName(){
        return nome;
    }
}
