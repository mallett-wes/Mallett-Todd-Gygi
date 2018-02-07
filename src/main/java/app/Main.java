package app;

import controller.GameController;
import model.Character;
import model.Game;
import view.CharacterView;
import view.GameView;

public class Main {
    public static void main(String... args){
        Game model = new Game();
        GameView view = new GameView();
        GameController gameController = new GameController(model, view);
        gameController.runGame();
    }
}
