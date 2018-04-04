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
    public boolean doAction(String input) throws NumberFormatException{
        int quantity = 0;
        try{
            quantity = Integer.parseInt(input);
        }catch(NumberFormatException e){
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
        
        if(quantity < 0){
            ErrorView.display(this.getClass().getName(), "Please enter a valid number");
            PurchaseSuppliesView view = new PurchaseSuppliesView();
            view.display();
        }
        
        SuppliesController suppliesController = new SuppliesController();
        
        suppliesController.purchaseSupplies(supply, quantity, Main.getGame().getTeam());
        console.println(Main.getGame().getTeam().getMoneyInPocket());
        console.println(Main.getGame().getTeam().getSupplies());
        
        PurchaseSuppliesView view = new PurchaseSuppliesView();
        view.display();
        
        return true;
    }
    
}
