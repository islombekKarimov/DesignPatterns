package test.designPattern.structural.flyWieght;

import test.designPatterns.structural.flyWieght.*;

/**
 * Created by Islombek Karimov on 30.06.2020.
 */
public class Circle implements test.designPatterns.structural.flyWieght.Shape {
    private String colour;
    private int x;
    private int y;
    private int radius;

    public Circle(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle : [ colour : " + colour + " x: " + x + " y: " + y + " radius: " + radius);
    }
}
