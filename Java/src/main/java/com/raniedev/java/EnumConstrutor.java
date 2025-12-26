/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raniedev.java;

/**
 *
 * @author Ranie
 */
enum EnumConstrutor {
    LOW("Low", 2),
    MEDIUM("Medium", 5),
    HIGH("high", 10);
    
    private String description;
    private int level;
    
    private EnumConstrutor(String description, int level) {
        this.description = description;
        this.level = level;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getLevel() {
        return level;
    }
}
