/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
public class PolimorfismoFilho extends PolimorfismoPai {
    String type = "Son";
    
    @Override
    public void msg(){
        System.out.println("Filho");
    }
    
    //Usar um método da classe pai através do super.
    public void goodbye(){
        super.goodbye();   
    }
    
    //Usar um atributo da classe pai através do super.
    public void exibir(){
        System.out.println(super.type);
    }
    
    //Chamar Construtor Pai
    PolimorfismoFilho(){
        super();
        System.out.println("Filho criado");
    }
}
