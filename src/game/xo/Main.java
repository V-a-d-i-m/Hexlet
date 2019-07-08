package game.xo;


import game.xo.controller.GameController;
import game.xo.model.Board;
import game.xo.view.AdvConsoleView;
import game.xo.view.ConsoleView;

public class Main {

    public static void main(String[] args) {

        final GameController game = new GameController();
        final AdvConsoleView advConsoleView = new AdvConsoleView(game);
        final ConsoleView consoleView = new ConsoleView(game);
        startGame(advConsoleView);

    }

    private static void startGame(final ConsoleView advConsoleView){
        advConsoleView.showGameName();
    }

}
