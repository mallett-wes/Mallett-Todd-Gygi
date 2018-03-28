/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Supplies;
import java.io.InputStreamReader;
import java.util.Scanner;
import Exceptions.SupplyWeightControllerException;


/**
 *
 * @author hiramtodd
 */
public class SupplyWeightController {

//    public boolean supplyWeightTooHeavy(Supplies supply, int quantity) throws SupplyWeightControllerException {
//        int supplyWeight = supply.getWeight();
//        int wagonWeight = 100;
//        int maxWeight = 3000;
//        long weight = quantity * supplyWeight;
//        int newWeight = 0;
//
//		throw new SupplyWeightControllerException("You have: " + (wagonWeight) + " lbs of supply left in your wagon");
//                
//            if(weight < 0) {
//                throw new SupplyWeightControllerException("Please enter how many pounds of food to load: ");
//                int loadedFood = reader.nextInt();
//                    
//                if(loadedFood < 0) {
//                    throw new SupplyWeightControllerException("Not enough food for travel!");
//                } else if (loadedFood + wagonWeight <= maxWeight) {
//                    throw new SupplyWeightControllerException("You have sufficient for your needs.");
//                    newWeight = wagonWeight + loadedFood;
//                } else {
//                    throw new SupplyWeightControllerException("You have exceeded the wagon's weight limit!");
//                }
//            } else { 
//                throw new SupplyWeightControllerException("You are ready for travel!");
//            }
//		
//   		throw new SupplyWeightControllerException("The wagon's weight is now " + (maxWeight - newWeight) + " lbs.");
//    }
}
