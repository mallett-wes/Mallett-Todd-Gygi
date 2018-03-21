package app;

import Views.StartProgramView;
import model.Game;
import model.Character;
import model.Team;

public class Main {
    private static Character character = null;
    private static Game game = null;
    
    public static void main(String... args){
        try{
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();           
        }catch(Exception e){
            System.out.println("There was an error starting the program. " + e.getMessage());
        }        
    }

    public static Character getCharacter() {
        return character;
    }

    public static void setCharacter(Character character) {
        Main.character = character;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        Main.game = game;
    }

}
