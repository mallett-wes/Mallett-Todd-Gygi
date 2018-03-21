/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Exceptions.SuppliesControllerExceptions;
import model.Supplies;
import model.SupplyType;
import model.Team;

/**
 *
 * @author hiramtodd
 */
public class SuppliesController {
    
    public SupplyType purchaseSupplies(SupplyType supply, int quantity, Team team) throws SuppliesControllerExceptions {
        
    if(quantity < 1){
        throw new SuppliesControllerExceptions("You must enter a quantity greater than 0.");
    }
    if(supply == null){
        throw new SuppliesControllerExceptions("You must select a valid supply.");
    }
    if(team == null){
        throw new SuppliesControllerExceptions("You must be on a team to purchase supplies.");
    }
    if(supply.getValue() < 1){
        throw new SuppliesControllerExceptions("This supply is unavailable");
    }

    double totalCostOfSupply = supply.getValue() * quantity;
    double moneyInPocket = team.getMoneyInPocket();

    if(moneyInPocket >= totalCostOfSupply) {
        team.setMoneyInPocket(moneyInPocket - totalCostOfSupply);
        team.addSuppliesToStock(supply, quantity);
    }else{
        throw new SuppliesControllerExceptions("You do not have enough money to purchase these supplies.");
    }

    return supply;
}

}
