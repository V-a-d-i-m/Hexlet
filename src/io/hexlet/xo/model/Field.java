// BEGIN (write your solution here)
package io.hexlet.xo.model;
// END

public class Field {

    private static final int SIZE_FIELD = 3;

    private String [][] figures = new String[SIZE_FIELD][SIZE_FIELD];
    // BEGIN (write your solution here)
    public int getSize(){
        return figures.length;
    }
    // END
    // BEGIN (write your solution here)
    public String getFigure(Point point){
        return figures[point.x][point.y];
    }
    // END
    // BEGIN (write your solution here)
    public void setFigure(Point point, String figure){

        figures[point.x][point.y] = figure;

    }
    // END
}