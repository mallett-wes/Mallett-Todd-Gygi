package Views;

import Controller.CharacterController;
import app.Main;
import model.Character;

public class StartProgramView extends View{

    public StartProgramView(){
        super("Welcome to Mormon Trek!" +
                "\nPlease enter the name of your character: ");
    }

    @Override
    public boolean doAction(String input){
        String mainCharacterName = input;
        CharacterController characterController = new CharacterController();
        
        Character mainCharacter = characterController.selectMainCharacter(mainCharacterName);
       
        if(mainCharacter == null){
            System.out.println("There was a problem saving your player. Please try again.");
        }else{
            Main.setCharacter(mainCharacter);
            
            mainCharacter.setDescription("TEST");
            mainCharacter.setStamina(8);
            
            System.out.println("Welcome to the game, " + mainCharacterName + "!");
            System.out.println("We hope you have lots of fun!");
        }

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return true;
    }
}
