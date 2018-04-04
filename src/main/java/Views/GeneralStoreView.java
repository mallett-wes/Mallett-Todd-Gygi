/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Kyrie Gygi
 */
public class GeneralStoreView extends View {
    
   public GeneralStoreView(){
       super("Welcome to the General Store! What would you like to do?" +
               "\nP - Purchase Supplies" +
               "\nE - Return to Main Menu");
   }
   
   @Override
    public boolean doAction(String input){
        switch(input){
            case"P":
               PurchaseSuppliesView purchaseSuppliesView = new PurchaseSuppliesView();
               purchaseSuppliesView.display();
               return false;
            case"E":
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Please enter a valid selection.");
                return true;
        }
    }
    
}
