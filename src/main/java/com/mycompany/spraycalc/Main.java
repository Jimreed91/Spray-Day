/*

 */
package com.mycompany.spraycalc;

/**
 *
 * @author james
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Crop santana = new Crop("Santana", 8, 3);
        
        Crop natyura = new Crop("Natyura", 1.2, 3);
        
       
        
        Product azatin = new Product(16000);
        
        Nozzle yellow = new Nozzle("Yellow", 1.03);
        
        Sprayer no1 = new Sprayer("Agrispray", 1600, 16, yellow);
        
       
        Double numOfTanks = no1.howManytank(santana);
        int totalMix = no1.totalMix(santana);
        int productPerTank = no1.productPerTank(azatin, santana);
        int waterPerHectare = no1.waterPerHectare(santana);
        double sprayOutput = no1.sprayOutput(yellow);
        int partTank = no1.partTank(santana);
    
       
          System.out.println(numOfTanks + " full tanks required"); 
          System.out.println("Total mix" + totalMix);
          System.out.println("Product per tank" + productPerTank);
          System.out.println("Water per hectare" + waterPerHectare);
          System.out.println("Spray output" + sprayOutput);
          System.out.println("Final tank volume" + partTank);
        
          UI inter = new UI();
          inter.setup();
          
    }
    
  
    
}
