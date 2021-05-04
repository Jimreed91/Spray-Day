/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spraycalc;

import java.util.Scanner;

/**
 *
 * @author james
 */
public class UI {
   Scanner scanner = new Scanner(System.in);

    public UI() {
        
    }
    
    public void setup() {
        String answer;
        System.out.println("Spray-Day, air assisted orchard spraying calculator");
        System.out.println("Would you like to add a new sprayer? (y/n)");
        answer = scanner.nextLine();
        
        if(answer.equals("y")) {
            this.sprayerInfo();
        }
        
        
    }
    
    public Sprayer sprayerInfo() {
        

        System.out.println("Please enter a name to identify the sprayer:");
        String name = scanner.nextLine();
        
        System.out.println("Enter capacity of sprayer '" + name + "' in litres");
        int capacity = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Enter number of nozzles for sprayer '" + name + ":");
        int nozzles = Integer.valueOf(scanner.nextLine());
        
       
        Nozzle nozzleType = nozzleInfo();
        Sprayer output = new Sprayer(name, capacity, nozzles, nozzleType);
        return output;
    }
    
    public Nozzle nozzleInfo() {
        System.out.println("Default nozzle is yellow (1.03L/min at 10Bar), would you like to change nozzle? (y/n)");
        String answer = scanner.nextLine();
        
        if(answer.equals("y")) {
        System.out.println("Enter nozzle colour:");
        String colour = scanner.nextLine();
        System.out.println("Enter nozzle output for " +  colour + "(L/minute)");
        int nozzleOutput = Integer.valueOf(scanner.nextLine());
        Nozzle output = new Nozzle(colour, nozzleOutput);
        return output;
        }
          Nozzle output = new Nozzle("Yellow", 1.03);
          return output;
    }
    
    public Crop cropInfo() {
        System.out.println("Enter name for crop");
        String name = scanner.nextLine();
        System.out.println("Enter hectares of crop: " + name + "(ha)" );
        double hectares = Double.valueOf(scanner.nextLine());
        System.out.println("Enter row spacing for crop: " + name + "(m)");
        double spacing = Double.valueOf(scanner.nextLine());
        
        Crop out = new Crop(name, hectares, spacing);
        return out;
    }
    
}
