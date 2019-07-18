package io.hexlet.xo.controllers;
// BEGIN (write your solution here)
import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

// END
public class CurrentMoveController {
    // BEGIN (write your solution here)
    public String currentMove(Field field){
        int count = 0;

        for (int i = 0; i < field.getSize(); i++) {
            for (int j = 0; j < field.getSize(); j++) {
                Point point = new Point(i,j);
                if (field.getFigure(point) == "X"  || field.getFigure(point) == "O"){
                    count++;
                }
            }
        }

        if ((count % 2) == 0){
            return "X";
        } else {
            return "O";
        }
    }
    // END
}
