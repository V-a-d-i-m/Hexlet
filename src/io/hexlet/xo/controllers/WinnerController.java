package io.hexlet.xo.controllers;
// BEGIN (write your solution here)
import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

// END
public class WinnerController {
    // BEGIN (write your solution here)
    public String getWinner(Field field) {

        Point point4 = new Point(0,0);
        Point point5 = new Point(1,1);
        Point point6 = new Point(2,2);

        Point point7 = new Point(2,0);
        Point point8 = new Point(1,1);
        Point point9 = new Point(0,2);

        for (int i = 0; i < field.getSize(); i++) {


            Point point1 = new Point(0, i);
            Point point2 = new Point(1, i);
            Point point3 = new Point(2, i);





            if (field.getFigure(point1) != null
                    && field.getFigure(point2) != null
                    && field.getFigure(point3) != null
                    && field.getFigure(point1).equals(field.getFigure(point2))
                    && field.getFigure(point1).equals(field.getFigure(point3))) {

                return field.getFigure(point1);

            }
        }

        for (int i = 0; i < field.getSize(); i++) {


            Point point1 = new Point(i, 0);
            Point point2 = new Point(i, 1);
            Point point3 = new Point(i, 2);





            if (field.getFigure(point1) != null
                    && field.getFigure(point2) != null
                    && field.getFigure(point3) != null
                    && field.getFigure(point1).equals(field.getFigure(point2))
                    && field.getFigure(point1).equals(field.getFigure(point3))) {

                return field.getFigure(point1);

            }
        }

        if (field.getFigure(point4) != null
                && field.getFigure(point5) != null
                && field.getFigure(point6) != null
                && field.getFigure(point4).equals(field.getFigure(point5))
                && field.getFigure(point4).equals(field.getFigure(point6))) {

            return field.getFigure(point4);

        } else if (field.getFigure(point7) != null
                && field.getFigure(point8) != null
                && field.getFigure(point9) != null
                && field.getFigure(point7).equals(field.getFigure(point8))
                && field.getFigure(point7).equals(field.getFigure(point9))){

            return field.getFigure(point7);
        }
        return null;
    }
}

