package controller;

import model.Character;
import model.Game;
import model.Team;
import view.CharacterView;
import view.GameView;
import view.TeamView;

import java.io.CharConversionException;
import java.util.Date;

public class GameController {

    private Game gameModel;
    private GameView gameView;

    public GameController(Game model, GameView view){
        gameModel = model;
        gameView = view;
    }

    public void setGameName(String name){
        gameModel.setName(name);
    }

    public void setSeason(String season){
        gameModel.setSeason(season);
    }

    public void setStartDate(Date date){
        gameModel.setDate(date);
    }

    public void setTotalTime(int time){
        gameModel.setTotalTime(time);
    }

    public void runGame(){
        int selection = gameView.welcomeToGame();

        switch(selection){
            case 1:
                startNewGame();
                break;
            case 2:
                loadGame();
                break;
        }
    }

    public void startNewGame(){
        CharacterController characterController = new CharacterController(new Character(), new CharacterView());
        TeamController teamController = new TeamController(new Team(), new TeamView());

        Character mainPlayer = characterController.selectMainCharacter();
        Team team = teamController.createTeam(mainPlayer);

        System.out.println("Your Character is: " + mainPlayer.toString());
        System.out.println("Your Team: " + team.toString());

    }

    public void loadGame(){

    }
}
