/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.TeamController;
import app.Main;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Character;

/**
 *
 * @author wesmallett
 */
public class SelectTeamView {
    private Scanner scanner;

    public SelectTeamView(){
        scanner = new Scanner(new InputStreamReader(System.in));
    }

    public void displaySelectTeamView(){
        if(Main.getTeam() == null){
            TeamController teamController = new TeamController();
            List<Character> teamMembers = new ArrayList<>();
            
            Main.setTeam(teamController.createTeam(teamMembers));
        }
        
        do{
            doAction(getInputs());
        }while(Main.getTeam().getMembers().size() < 4);
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private int[] getInputs(){
        int[] input = new int[1];
        
        System.out.println("Select a Character to be on your team");
        if(!Main.getTeam().getMembers().toString().contains("Bill")){
            System.out.println("1 - Bill");
        }
        if(!Main.getTeam().getMembers().toString().contains("Bob")){
            System.out.println("2 - Bob");
        }
        if(!Main.getTeam().getMembers().toString().contains("Sue")){
            System.out.println("3 - Sue");
        }
        if(!Main.getTeam().getMembers().toString().contains("Henry")){
            System.out.println("4 - Henry");
        }

        int result = scanner.nextInt();

        while(result < 1 || result > 4){
            System.out.println("You must select a character by entering an option listed.");
            result = scanner.nextInt();
        }

        input[0] = result;

        return input;
    }

    private boolean doAction(int[] inputs){
        switch(inputs[0]){
            case 1:
                Character bill = new Character();
                bill.setName("Bill");
                bill.setStamina(3);
                bill.setHealthRating(8);
                bill.setSpecialSkill("Hunting");
                Main.getTeam().addCharacterToTeam(bill);
                break;
            case 2:
                Character bob = new Character();
                bob.setName("Bob");
                bob.setStamina(3);
                bob.setHealthRating(8);
                bob.setSpecialSkill("Fishing");
                Main.getTeam().addCharacterToTeam(bob);
                break;
            case 3:
                Character sue = new Character();
                sue.setName("Sue");
                sue.setStamina(3);
                sue.setHealthRating(8);
                sue.setSpecialSkill("Gathering");
                Main.getTeam().addCharacterToTeam(sue);
                break;
            case 4:
                Character henry = new Character();
                henry.setName("Henry");
                henry.setStamina(3);
                henry.setHealthRating(8);
                henry.setSpecialSkill("Building");
                Main.getTeam().addCharacterToTeam(henry);
                break;
            default:
                System.out.println("Sorry, you did not enter a valid selection.");
                break;
        }

        return true;
    }
}
