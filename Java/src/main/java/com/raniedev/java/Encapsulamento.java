/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
public class Encapsulamento {
    //Encapsular significa proteger o acesso dos atributos e métodos de uma classe
    //Esses atributos são definidos com o "private" e métodos públicos get and set são criados para acessá-los
    private String nome;
    private int idade;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
}
