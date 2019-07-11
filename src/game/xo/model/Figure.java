package game.xo.model;

public class Figure {

    private final String figure;

    public Figure(final String figure){
        assert figure != null;

        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

}
