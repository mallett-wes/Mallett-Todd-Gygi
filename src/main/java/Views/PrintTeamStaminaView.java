/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import app.Main;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.logging.Level;
import model.SupplyType;

/**
 *
 * @author hiramtodd
 */

public abstract class PrintTeamStaminaView extends View {
    
    public PrintTeamStaminaView() {
        super("Would you like to see a list of your team's stamina? Y or N");
    }
    
    private void printStaminaReport(String fileName) {
        PrintWriter outputStream = null;

        try(outputStream = new PrintWriter(fileName)) {

            HashMap<Character, Integer> teamStamina = Main.getName().getStamina();
            
            //print title and column headings
            outputStream.println("\n\n              Team Stamina                ");
            outputStream.printf("%n%-20s%10s%10s", "Team Member", "Stamina Level");
            outputStream.printf("%n%-20s%10s%10s", "-----------", "-------------");

            //print the team member name and stamina level
            for(Level level : staminaLevel) {
                HashMap.Entry<SupplyType, Integer> item : teamSupplies.entrySet()
                out.printf("%n%-20s%7d%13.2f", item.getName(), item.getStamina();
            
            }

        } catch (FileNotFoundException ex) {
            ErrorView.display(this.getClass().getName(), "An Error Occurred: " + ex.getMessage());
        }
        
        outputStream.close();
        
        Path filePath = Paths.get(fileName);
        console.println("Your file has successfully been saved: " + filePath.toAbsolutePath().toString());
    }

    @Override
    public boolean doAction(String value) {

        switch(value) {
            case "Y":
                this.displayMessage = "Please name the file to save?";
                String fileName = this.getInput().toLowerCase();
                printStaminaReport(fileName);
                break;
            case "N":
                break;
            default:

                return false;
        }
        
        return true;
    }
}

