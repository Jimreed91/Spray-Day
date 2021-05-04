/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spraycalc;

/**
 *
 * @author james
 */
public class Crop {
    public String name;
    public double hectares;
    public double spacing;

 
    
    public Crop(String name, double hectares, double spacing) {
        this.name = name;
        this.hectares = hectares;
        this.spacing = spacing;
        
    }

       public double getSpacing() {
        return spacing;
    }
    
    
    public String getName() {
       return name;
    }
    
    public double getArea() {
        return hectares;
    }
    
}
