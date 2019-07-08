package game.xo.controller;

import game.xo.model.Player;

public class GameController {

    private static final int MIN_COORDINATE = 0;

    private static final int MAX_COORDINATE = 2;

    private final String gameName;

    private Player[] players;

    public GameController(String gameName){
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y){

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
