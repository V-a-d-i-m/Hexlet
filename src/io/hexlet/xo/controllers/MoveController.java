package io.hexlet.xo.controllers;

// BEGIN (write your solution here)
import io.hexlet.xo.model.*;
// END

public class MoveController {
    // BEGIN (write your solution here)
    public boolean applyFigure(final Field field,
                            final Point point,
                            final String figure){

        if (!ckeckCoordinate(point)){
            return false;
        } else if (field.getFigure(point) != null){
            return false;
        }
        field.setFigure(point, figure);
        return true;
    }


    public boolean ckeckCoordinate(Point coordinate){
        if (coordinate.x < 0 || coordinate.y < 0 ||  coordinate.x > 2 || coordinate.y > 2){
            return false;
        }
        return true;
    }


    // END
}
