/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import app.Main;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import model.SupplyType;

/**
 *
 * @author wesmallett
 */
public class PrintTeamSuppliesView extends View{
    
    public PrintTeamSuppliesView(){
        super("Would you like to print a list of your team's supplies? Y or N");
    }
    
    private void printReport(String fileName){
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(fileName);
        } catch (FileNotFoundException ex) {
            //ErrorView.display(this.getClass().getName(), "An Error Occurred: " + ex.getMessage());
        }
        
        HashMap<SupplyType, Integer> teamSupplies = Main.getGame().getTeam().getSupplies();
        outputStream.println("\t\t\t    Team Supplies On Hand");
        outputStream.println("------------------------------------------------------------------------");
        outputStream.println("Description of Supply\t|\tQuantity In Stock\t|\tValue");
        outputStream.println("------------------------------------------------------------------------");
        for(HashMap.Entry<SupplyType, Integer> item : teamSupplies.entrySet()){
               SupplyType supply = item.getKey();
               int quantity = item.getValue();
               int supplyValue = supply.getValue() * quantity;
            outputStream.println(supply.getKey() + "\t\t\t\t\t" + quantity + "\t\t\t$" + supplyValue +".00");
        }
        
        outputStream.close();
        
        Path filePath = Paths.get(fileName);
        console.println("Your file has successfully been saved: " + filePath.toAbsolutePath().toString());
    }

    @Override
    public boolean doAction(String value) {
        switch(value){
            case "Y":
                this.displayMessage = "What would you like to name the saved file?";
                String fileName = this.getInput().toLowerCase();
                printReport(fileName);
                break;
            case "N":
                break;
            default:
                //ErrorView.display(this.getClass().getName(), "You must enter Y or N");
                return false;
        }
        
        return true;
    }
    
}
