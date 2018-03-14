/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.SuppliesController;
import app.Main;
import model.SupplyType;

/**
 *
 * @author wesmallett
 */
public class SelectSupplyQuantityToPurchaseView extends View{
    SupplyType supply;
    
    public SelectSupplyQuantityToPurchaseView(SupplyType supplyType){
        super("How many " + supplyType.getKey() + " would you like to purchase? \nEach one costs $" + supplyType.getValue());
        supply = supplyType;
    }
    
    @Override
    public boolean doAction(String input){
        int quantity = Integer.parseInt(input);
        
        if(quantity < 0){
            System.out.println("Please enter a valid number");
            GeneralStoreView view = new GeneralStoreView();
            view.display();
        }
        
        SuppliesController suppliesController = new SuppliesController();
        
        try{
            suppliesController.purchaseSupplies(supply, quantity, Main.getGame().getTeam());
            System.out.println(Main.getGame().getTeam().getMoneyInPocket());
            System.out.println(Main.getGame().getTeam().getSupplies());
        }catch(Exception e){
            System.out.println("There was an error: " + e.getMessage());
        }
        
        GeneralStoreView view = new GeneralStoreView();
        view.display();
        
        return true;
    }
    
}
