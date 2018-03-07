/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author hiramtodd
 */
public class GettingHelpView extends View{
    
    public GettingHelpView(){
        super("G - What is the goal of the game?" +
        "\nM - How to move" +
        "\nE - Estimate the number of resources" +
        "\nH - Harvest resources" +
        "\nD - Delivering resources to warehouse" +
        "\nQ - Exit Help Menu");
    }
    
    @Override
    public boolean doAction(String input){
        String selection = input;
        
        switch(selection){
            case "G":
                System.out.println("This is the goal!");
                break;
            case "M":
                System.out.println("This is how you move.");
                break;
            case "E":
                System.out.println("This is how you estimate the number of resources");
                break;
            case "H":
                System.out.println("This is how you harvest resources.");
                break;
            case "D":
                System.out.println("This is how you deliver resources to the warehouse.");
                break;
            case "Q":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
            default:
                System.out.println("Invalid Menu Option.");
        }
        
        return true;
    }
}
