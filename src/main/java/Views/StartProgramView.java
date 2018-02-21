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
        String result = scanner.nextLine().trim().toLowerCase();

        while(result.length() < 1){
            System.out.println("You must enter a non-blank value or enter q to quit.");
            result = scanner.nextLine().trim().toLowerCase();

            if(result.equals("q")) {
                System.exit(0);
            }
        }

        input[0] = result;

        return input;
    }

    private boolean doAction(String[] inputs){
        String mainCharacterName = inputs[0].toString();
        CharacterController characterController = new CharacterController();
        try{
            characterController.selectMainCharacter(mainCharacterName);
        }catch (Exception e){
            System.out.println(e.getMessage().toString());
            displayStartProgramView();
        }finally{
            System.out.println("Welcome to the game, " + mainCharacterName + "!");
            System.out.println("We hope you have lots of fun!");
        }
        MainMenuView mainMenuView = new MainMenuView();
        return true;

    }
}
