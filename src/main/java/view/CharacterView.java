package view;

import controller.CharacterController;
import model.Character;

import java.io.InputStreamReader;
import java.util.Scanner;

public class CharacterView {

    Scanner scanner = new Scanner(new InputStreamReader(System.in));

    public String nameCharacter(){
        System.out.println("Enter the name of your character: ");
        return scanner.nextLine();
    }

    public String characterSkills(){
        System.out.println("Which Skill do you want?");
        System.out.println("1. Hunting");
        System.out.println("2. Fishing");
        System.out.println("3. Dancing");

        String skill = null;
        int input = scanner.nextInt();

        switch(input){
            case 1:
                skill = "Hunting";
                break;
            case 2:
                skill = "Fishing";
                break;
            case 3:
                skill = "Dancing";
                break;
        }

        return skill;
    }

    public String displayAllCharacters(){
        System.out.println("1. Bill the fisher");
        System.out.println("2. Bob the gatherer");
        System.out.println("3. mary the child bearer");

        int input = scanner.nextInt();

        String character = null;
        switch(input){
            case 1:
                character = "bill";
                break;
            case 2:
                character = "bob";
                break;
            case 3:
                character = "mary";
                break;
        }

        return character;
    }
}
