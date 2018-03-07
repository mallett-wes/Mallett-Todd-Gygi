/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.InputStreamReader;
import java.util.Scanner;
import model.Supplies;
import model.Team;

/**
 *
 * @author hiramtodd
 */
public class supplyWeightController {

    public boolean supplyWeightTooHeavy(Supplies supply, int quantity){
        int supplyWeight = supply.getWeight();
        //Calculates weight
        long weight = quantity * supplyWeight;

        //The if cases to display if supply is too heavy, not enough, or just right'.
        if (weight > 500) {
            return true;
        } else {
            return false;
        }
    }
}
