package app;

import Views.StartProgramView;
import model.Game;
import model.Character;
import model.Team;

public class Main {
    private static Character character = null;
    private static Game game = null;
    private static Team team = null;

    public static Team getTeam() {
        return team;
    }

    public static void setTeam(Team team) {
        Main.team = team;
    }
    
    public static void main(String... args){
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
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
