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
public class Nozzle {
    private double output;
    private String colour;
    
    public Nozzle(String color, double out) {
    
            this.output = out;
            this.colour = colour;
    }
    
    public double getOutput() {
        return output;
    }
    
    public String getColour() {
        return colour;
    }

    
    
}
