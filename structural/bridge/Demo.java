package test.designPattern.structural.bridge;

import test.designPatterns.structural.bridge.Circle;
import test.designPatterns.structural.bridge.GreenCircle;
import test.designPatterns.structural.bridge.RedCircle;
import test.designPatterns.structural.bridge.Shape;

/**
 * Created by Islombek Karimov on 17.06.2020.
 */
public class Demo {

    public static void main(String[] args) {
        Shape redShape = new Circle(new RedCircle(), 100, 100, 10);
        Shape greenShape = new Circle(new GreenCircle(), 50, 50, 50);
        redShape.draw();
        greenShape.draw();
    }
}
