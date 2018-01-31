package controller;

import model.Character;
import model.Game;
import model.Team;
import view.GameView;

import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class GameController {

    Scanner scanner = new Scanner(new InputStreamReader(System.in));

    Game game = new Game();
    GameView gameView = new GameView();
    CharacterController characterController = new CharacterController();
    TeamController teamController = new TeamController();

    public void setGameName(String name){
        game.setName(name);
    }

    public void setSeason(String season){
        game.setSeason(season);
    }

    public void setStartDate(Date date){
        game.setDate(date);
    }

    public void setTotalTime(int time){
        game.setTotalTime(time);
    }

    public void runGame(){
        gameView.welcomeToGame();
        int selection = scanner.nextInt();
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
        Character mainPlayer = characterController.selectMainCharacter();
        Team team = teamController.createTeam(mainPlayer);

        System.out.println("Your Character is: " + mainPlayer.toString());
        System.out.println("Your Team: " + team.toString());

    }

    public void loadGame(){

    }
}
