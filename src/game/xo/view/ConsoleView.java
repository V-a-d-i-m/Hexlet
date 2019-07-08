package game.xo.view;


import game.xo.controller.GameController;

public class ConsoleView {

    protected final GameController game;

    public ConsoleView(final GameController game) {
        this.game = game;
    }

    public void showGameName(){
        System.out.println(game.getGameName());
    }

    public void showPlayersName(){
        System.out.println(game.getPlayers());
    }
}
