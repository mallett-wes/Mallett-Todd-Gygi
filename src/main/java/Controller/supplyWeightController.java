/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Supplies;
import model.Team;

/**
 *
 * @author hiramtodd
 */
public class supplyWeightController {
    public Supplies supplyWeight(Supplies supply, int quantity, Team team) throws Exception {
     //Prompt user input for declaring value
    String input;
   
    //Prompt user input for declaring value
double weight;

    //Prompt user for the objects mass
    input = System.out.println(null, "Enter number amount ");

    //Convert user input to data-type double because
    // JOptionPane returns data-type String.
    double amount = Double.parseDouble(input);

    //Calculate weight
    weight = amount * 10;

    //Design decision structure to determine if 
    //weight is 'too heavy' or 'too light'.

    if(weight > 500){
    throw new Exception(null, "Supply exceeds weight limit!");
    }

    else if (weight < 1) {
        throw new Exception(null, "Supply is depleted.");
    }
    // Optional branch
    else {
    throw new Exception(null, "Supplies do not exceed weight limit!");
    }
   }
}