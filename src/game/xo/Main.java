package game.xo;


import game.xo.controller.GameController;
import game.xo.model.Board;
import game.xo.view.AdvConsoleView;
import game.xo.view.ConsoleView;

public class Main {


    public static void main(String[] args) {

//        testBoard();
//        testFugure();
//        testGameController();
//        testPlayer();
//        testConsoleView();

        Board board = new Board();
        board.initArray();
        board.showBoard();

        final GameController gameController = new GameController("XO");
        final AdvConsoleView advConsoleView = new AdvConsoleView(gameController);
        final ConsoleView consoleView = new ConsoleView(gameController);
        startGame(advConsoleView);
        startGame(consoleView);

    }

    private static void startGame(final ConsoleView advConsoleView){
        advConsoleView.showGameName();
    }

}
