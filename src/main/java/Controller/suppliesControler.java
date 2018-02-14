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
public class suppliesControler {
    public Supplies purchaseSupplies(Supplies supply, int quantity, Team team) throws Exception {
    if(quantity < 1){
        throw new Exception("You must enter a quantity greater than 0.");
    }
    if(supply == null){
        throw new Exception("You must select a valid supply.");
    }
    if(team == null){
        throw new Exception("You must be on a team to purchase supplies.");
    }
    if(supply.getPrice() < 1){
        throw new Exception("This supply is unavailable");
    }


    double totalCostOfSupply = supply.getPrice() * quantity;
    double moneyInPocket = team.getMoneyInPocket();

    if(moneyInPocket >= totalCostOfSupply) {
        team.setMoneyInPocket(moneyInPocket - totalCostOfSupply);
    }else{
        throw new Exception("You do not have enough money to purchase these supplies.");
    }

    supply.setQuantityInStock(quantity);
    return supply;
}

}
