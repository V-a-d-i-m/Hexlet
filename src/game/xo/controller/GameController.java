package game.xo.controller;

import game.xo.model.Figure;
import game.xo.model.Player;

public class GameController {

    private static final int MIN_COORDINATE = 0;

    private static final int MAX_COORDINATE = 2;

    private static final int PLAYERS_COUNT = 2;

    private final String gameName;

    private Player[] players = new Player[]{new Player("Max", new Figure("0")),
                                            new Player("Leo", new Figure("X"))};



    public GameController(final String gameName){
        if (gameName == null || gameName.isEmpty()){
            this.gameName = "X0";
        } else {
            this.gameName = gameName;
        }
    }

    public String getGameName() {
        return gameName;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y){

        assert x >= 0;
        assert y >= 0;

        if (! checkCoordinate(x) || !checkCoordinate(y) ) {
            return false;
        }

        return true;
    }

    public Player[] getPlayers() {
        return players;
    }

    private static boolean checkCoordinate (final int coordinate){
        if(coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE)
            return false;

        return true;
    }
}
