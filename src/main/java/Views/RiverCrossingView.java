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
public class RiverCrossingView extends View{
    
    public RiverCrossingView(){
        super("You have reached a river!" +
        "\nIf you wish too cross the river, enter 'C'" +
        "\nIf not, enter 'N' and return to camp.");
    }
    
    @Override   
    public boolean doAction(String input){
        switch(input){
            case "C":
                GameView GameView = new GameView();
                break;
                
            case "N":
                DayEndView dayEndView = new DayEndView();
                dayEndView.display();
                break;
                
            default:
            System.out.println("Invalid input!");
            break;
        }
        
        return true;
    }
}