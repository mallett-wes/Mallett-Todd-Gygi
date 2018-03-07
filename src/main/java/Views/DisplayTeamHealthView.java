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
public class DisplayTeamHealthView extends View{
    
    public DisplayTeamHealthView(){
        super("E - Return to Game Play"
                + "\nM - Go to Main Menu");
    }
    
//    @Override
//    public boolean doAction(String input){
//        CharacterController characterController = new CharacterController();
//        for(Character member: Main.getTeam().getMembers()){
//            int currentHealth = 0;
//            try{
//                currentHealth = characterController.calculateHealth(Main.getTeam().getPace(), 2, member.getStamina());
//                
//                if(Main.getCharacter().equals(member)){
//                    System.out.println(member.getName() + "(you) ..... " + currentHealth);
//                }else{
//                    System.out.println(member.getName() + " ..... " + currentHealth);
//                }
//                
//                
//            }catch(Exception e){
//                if(Main.getCharacter().equals(member)){
//                    System.out.println(member.getName() + "(you) ..... Could Not Calculate");
//                }else{
//                    System.out.println(member.getName() + " ..... Could Not Calculate");
//                }
//            }    
//        }
//        
//        return true;
//    } 
    
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
