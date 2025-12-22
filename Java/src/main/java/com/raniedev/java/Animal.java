/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
public class Animal {
    int age;
    String nome;
    String tipo;
    boolean vacinado;
    
    //Construtores
    public Animal(){
        System.out.println("O animal já foi vacinado.");
    }
    
    public Animal(int x){
        age = x;
    }
    
    //Construtor com 2 parâmetros
    public Animal(int x, String y){
        age = x;
        nome = y;
    }
    
    //Construtor usando .this
    public Animal(int age, String nome, String tipo){
        this.age = age; //"this.age" é da classe enquanto que o outro "age" é referente ao argumento que virá via parâmetro
        this.nome = nome;
        this.tipo = tipo;
    }
    
    //this pode ser usado também para especificar e chamar um outro construtor
    public Animal(int age, String nome, String Tipo, boolean vacinado){
        this();//Chamando o construtor vazio
    }    
}
