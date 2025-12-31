/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

import java.util.Comparator;

/**
 *
 * @author Ranie
 */
public class OrdenarPorAno implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Carro a = (Carro) o1;
        Carro b = (Carro) o2;
        
        //Comparar os objetos
        if (a.getAno() < b.getAno()) return -1; //Primeiro carro tem o ano menor
        if (a.getAno() > b.getAno()) return 1; //Segundo carro tem o ano maior
        return 0; //Quando ambos os carros tem o mesmo ano
    }
    
}
