package test.designPattern.structural.flyWieght;

import test.designPatterns.structural.flyWieght.Circle;
import test.designPatterns.structural.flyWieght.ShapeFactory;

/**
 * Created by Islombek Karimov on 30.06.2020.
 */
public class Demo {

    private static final String colours[] = {"Black", "White", "Green", "Yellow", "Red", "Blue"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColour());
            circle.setColour(getRandomColour());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();

        }
    }

    private static String getRandomColour() {
        return colours[(int) (Math.random() * colours.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }
    private static int getRandomY(){
        return (int) (Math.random()*100);
    }
}
