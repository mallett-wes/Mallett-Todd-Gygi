/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.TeamController;
import app.Main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Character;

/**
 *
 * @author wesmallett
 */
public class SelectTeamView extends View {

    private static String billDescription = "This is a description of Bill. He is a hunter.";
    private static String bobDescription = "This is a description of Bob. He is a fisher.";
    private static String sueDescription = "This is a description of Sue. She is a gatherer.";
    private static String henryDescription = "This is a description of Henry. He is a skilled builder.";
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
        
        console.println("Select 3 Characters to be on your team.");
        if(!Main.getGame().getTeam().getMembers().toString().contains("Bill")){
            console.println("1 - Bill - " + billDescription);
        }
        if(!Main.getGame().getTeam().getMembers().toString().contains("Bob")){
            console.println("2 - Bob - " + bobDescription);
        }
        if(!Main.getGame().getTeam().getMembers().toString().contains("Sue")){
            console.println("3 - Sue - " + sueDescription);
        }
        if(!Main.getGame().getTeam().getMembers().toString().contains("Henry")){
            console.println("4 - Henry - " + henryDescription);
        }

        try {
            selection = this.keyboard.readLine();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error Could not read your input, " + ex.getMessage());
        }
            int selectionInt = Integer.parseInt(selection);
        while(selectionInt < 1 || selectionInt > 4){
            ErrorView.display(this.getClass().getName(), "You must select a character by entering an option listed.");
            try {
                selection = this.keyboard.readLine();
                selectionInt = Integer.parseInt(selection);
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "There was an error: " + ex.getMessage());
            }
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
                ErrorView.display(this.getClass().getName(), "Sorry, you did not enter a valid selection.");
                break;
        }

        return true;
    }
}
