package test.designPattern.structural.flyWieght;

import test.designPatterns.structural.flyWieght.*;
import test.designPatterns.structural.flyWieght.Circle;

import java.util.HashMap;

/**
 * Created by Islombek Karimov on 30.06.2020.
 */
public class ShapeFactory {
    private static final HashMap circleMap = new HashMap();

    public static test.designPatterns.structural.flyWieght.Shape getCircle(String colour) {
        test.designPatterns.structural.flyWieght.Circle circle = (test.designPatterns.structural.flyWieght.Circle) circleMap.get(colour);
        if (circle == null) {
            circle = new Circle(colour);
            circleMap.put(colour, circle);
            System.out.println("Creating Circle of colour : " + colour);
        }
        return circle;
    }

}
