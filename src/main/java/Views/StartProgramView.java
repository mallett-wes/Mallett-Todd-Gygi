package Views;

import Controller.CharacterController;
import model.Character;

import java.io.InputStreamReader;
import java.util.Scanner;

public class StartProgramView {
    Scanner scanner = new Scanner(new InputStreamReader(System.in));

    public StartProgramView(){

    }

    public void displayStartProgramView(){
        doAction(getInputs());
    }

    private String[] getInputs(){
        String[] input = new String[1];
        System.out.println("Welcome to Mormon Trek!");
        System.out.println("Please enter the name of your character: ");
        String result = scanner.nextLine().trim().toUpperCase();

        while(result.length() < 1){
            System.out.println("You must enter a non-blank value or enter Q to quit.");
            result = scanner.nextLine().trim().toUpperCase();

            if(result.equals("Q")) {
                System.exit(0);
            }
        }

        input[0] = result;

        return input;
    }

    private boolean doAction(String[] inputs){
        String mainCharacterName = inputs[0].toString();
        CharacterController characterController = new CharacterController();
        
        Character mainCharacter = characterController.selectMainCharacter(mainCharacterName);
        if(mainCharacter.equals(null)){
            System.out.println("There was a problem saving your player. Please try again.");
            displayStartProgramView();
        }else{
            System.out.println("Welcome to the game, " + mainCharacterName + "!");
            System.out.println("We hope you have lots of fun!");
        }

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
        return true;

    }
}
