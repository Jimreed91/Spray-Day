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
public class Sprayer {
    private String name;
    private int capacity;
    private int nozzleNo;
    private int speed ;
    private Nozzle nozzle;
    
    public Sprayer(String name, int cap, int noz) {
        this.capacity = cap;
        this.nozzleNo = noz;
        this.speed = 7;
        this.nozzle = new Nozzle("Yellow", 1.03);
    }
    
     
    
    public Sprayer(String name, int cap, int noz, Nozzle nozzle, int speed) {
        this.capacity = cap;
        this.nozzleNo = noz;
        this.speed = speed;
        this.nozzle = nozzle;
        
    }
    public Sprayer(String name, int cap, int noz, Nozzle nozzle) {
        this.capacity = cap;
        this.nozzleNo = noz;
        this.speed = 7;
        this.nozzle = nozzle;
        
    }
    
    
    
    public double  sprayOutput(Nozzle nozzle) {
double sprayOut = this.nozzleNo * nozzle.getOutput();
return sprayOut;
}
    
    public int waterPerHectare(Crop crop) {
   int output =(int) (this.sprayOutput(nozzle) * 600 / (crop.getSpacing() * this.speed));
   return output;
}
    
    public int productPerTank (Product product, Crop crop) {
   int output =(int) (product.getRate() * this.capacity) / waterPerHectare(crop);
   return output;
}
    
    public int totalMix ( Crop crop) {
       int output = (int) crop.getArea() * waterPerHectare(crop);
       return output;
    }
    
   public double howManytank(Crop crop) {
       double output = totalMix(crop)* 1.0 / this.capacity;
       return output;
   }
   
   public int partTank(Crop crop) {
      double inout = howManytank(crop);
       double whole =(int) inout;
       double part = inout -whole;
       
       return (int)part * totalMix(crop);
   }
    
    
    
    
    
    public int getCapacity() {
        return capacity;
        
    }
    
    public int getNozzles() {
        return nozzleNo;
    }
    
    
    
    public int getSpeed() {
        return speed;
    }
}
