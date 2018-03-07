/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


/**
 *
 * @author wesmallett
 */
public class GameMenuView extends View{
    

    public GameMenuView(){
      super("What would you like to do?" + "/nM - Move Forward" + "/nR - Rest" 
      + "/nP - Change Pace" + "/nH - View Your Team's Health" + "/nE - Main Menu"
      );
    }

  

    private void changePace(){
        System.out.println("Pace Change");
    };
    
    private void moveForward(){
        System.out.println("Moving on up");
    };
    
    private void rest(){
        System.out.println("RESTING.....STUB");
    };
    
    private void displayHealth(){
        DisplayTeamHealthView displayTeamHealthView = new DisplayTeamHealthView();
        displayTeamHealthView.display();
    }
     
    @Override
    public boolean doAction(String input){
        String menuItem;
        
        menuItem = input;

        switch(menuItem) {
            case "M": 
                moveForward();
                break;
                
            case "R": 
                rest();
                break;
                
            case "P": 
                changePace();
                break;
                
            case "H": 
                displayHealth();
                break;
            
            case "E":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
               
            default: System.out.println("Invalid menu item");
        }
        
        return true;
    }
}
