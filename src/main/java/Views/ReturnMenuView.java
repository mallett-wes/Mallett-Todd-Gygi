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
public class ReturnMenuView extends View{
    
    public ReturnMenuView(){
        super("E - Return to Game Play"
                + "\nM - Go to Main Menu");
    }
    
    @Override
    public boolean doAction(String input){       
        if(input.equals("E")){
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
            
        }else if(input.equals("M")){
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();
            
        }else{
            System.out.println("Invalid menu item");
        }
        
        return true;
    }
}
