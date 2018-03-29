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
public class SelectTeamView extends View {

    public SelectTeamView(){
        super();
    }

    @Override
    public void display(){
        if(Main.getGame().getTeam() == null){
            TeamController teamController = new TeamController();
            List<Character> teamMembers = new ArrayList<>();
            
            Main.getGame().setTeam(teamController.createTeam(teamMembers));
        }
        
        do{
            doAction(getInput());
        }while(Main.getGame().getTeam().getMembers().size() < 4);
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    @Override
    public String getInput(){
        boolean valid = false;
        String selection = null;
        
        System.out.println("Select a Character to be on your team");
        if(!Main.getGame().getTeam().getMembers().toString().contains("Bill")){
            System.out.println("1 - Bill");
        }
        if(!Main.getGame().getTeam().getMembers().toString().contains("Bob")){
            System.out.println("2 - Bob");
        }
        if(!Main.getGame().getTeam().getMembers().toString().contains("Sue")){
            System.out.println("3 - Sue");
        }
        if(!Main.getGame().getTeam().getMembers().toString().contains("Henry")){
            System.out.println("4 - Henry");
        }

        selection = this.keyboard.readLine();

        while(!"1".equals(selection) || !"2".equals(selection) || !"3".equals(selection) || !"4".equals(selection)){
            System.out.println("You must select a character by entering an option listed.");
            selection = this.keyboard.readLine();
        }

        

        return selection;
    }

    @Override
    public boolean doAction(String inputs){
        switch(inputs){
            case "1":
                Character bill = new Character();
                bill.setName("Bill");
                bill.setStamina(3);
                bill.setHealthRating(8);
                bill.setSpecialSkill("Hunting");
                Main.getGame().getTeam().addCharacterToTeam(bill);
                break;
            case "2":
                Character bob = new Character();
                bob.setName("Bob");
                bob.setStamina(3);
                bob.setHealthRating(8);
                bob.setSpecialSkill("Fishing");
                Main.getGame().getTeam().addCharacterToTeam(bob);
                break;
            case "3":
                Character sue = new Character();
                sue.setName("Sue");
                sue.setStamina(3);
                sue.setHealthRating(8);
                sue.setSpecialSkill("Gathering");
                Main.getGame().getTeam().addCharacterToTeam(sue);
                break;
            case "4":
                Character henry = new Character();
                henry.setName("Henry");
                henry.setStamina(3);
                henry.setHealthRating(8);
                henry.setSpecialSkill("Building");
                Main.getGame().getTeam().addCharacterToTeam(henry);
                break;
            default:
                System.out.println("Sorry, you did not enter a valid selection.");
                break;
        }

        return true;
    }
}
