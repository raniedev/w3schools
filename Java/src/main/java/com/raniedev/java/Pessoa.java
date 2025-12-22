/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
public class Pessoa {
    String nome = "Helena"; //Atributo da classe
    //Uma classe pode ser declarada com 'final' para evitar ser manipulada na chamada padrão
    final int id = 3435;
    int age;
    
    //Modificadores
    public int publ = 111;
    protected int prot = 222;
    int deft = 333;
    private int priv = 444;
    
    //Métodos
    public void olaClasse(){
        System.out.println("Olá Classe");
    }
    
    
}
