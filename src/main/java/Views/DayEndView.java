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
public class DayEndView extends View {

    public DayEndView() { 
            super("To go fishing, enter 'F'" + "\nTo go hunting, enter 'K'"
                    + "\nTo rest, enter 'R'" + "\nGet help, enter 'H'");
    }
    
    private void getHelp(){
        GettingHelpView helpView = new GettingHelpView();
        helpView.display();
    };
    
    @Override
    public boolean doAction(String input){
        String selection;
        selection = input;
        
        switch(selection){
            case "F":
                RiverView riverView = new RiverView();
                riverView.display();
                break;
                
            case "K":
                HuntingView huntingView = new HuntingView();
                huntingView.display();
                break;
                
            case "R":
                GameView gameView = new GameView();
                gameView.display();
                break;
            case "G":
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            case "H": 
                getHelp();
                break;
                
            default:
            System.out.println("That is an invalid selection!");
            break;
        
        }
        return true;
    }
}