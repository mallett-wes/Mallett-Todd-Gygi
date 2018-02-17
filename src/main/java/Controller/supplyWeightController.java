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

    if (quantity < 1) {
        String expectedResult("Supply is depleted.");
    }

    if (team == null) {
        String expectedResult("You must select your team to see supply.");
    }

    float totalSupplyWeight = supply.getWeight() * TenLbsBags;
    float maxWeightLimit = team.getWeightLimit(350);

    if (totalSupplyWeight > maxWeightLimit) {
        team.setWeightLimit(totalSupplyWeight >= maxWeightLimit);
        String expectedResult("Supply exceeds weight limit!");
    }
return supply;
}
