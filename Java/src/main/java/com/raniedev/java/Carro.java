/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
public class Carro {
    private String modelo;
    private int ano;
    private float preco;
    private boolean tem_ar;
    
    public Carro(String modelo, int ano, float preco, boolean tem_ar){
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.tem_ar = tem_ar;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isTem_ar() {
        return tem_ar;
    }

    public void setTem_ar(boolean tem_ar) {
        this.tem_ar = tem_ar;
    }        
}