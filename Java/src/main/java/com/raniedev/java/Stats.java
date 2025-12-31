/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
class Stats<X extends Number> {
    X[] numeros;
    Stats(X[] numeros){
        this.numeros = numeros;
    }
    
    //Calcular média
    double media(){
        double soma = 0;
        for(X num : numeros) {
            soma += num.doubleValue();
        }
        return soma / numeros.length;
    }
}
