package test.designPattern.structural.bridge;

import test.designPatterns.structural.bridge.*;

/**
 * Created by Islombek Karimov on 17.06.2020.
 */
public class Circle extends test.designPatterns.structural.bridge.Shape {
    private int radius, x, y;

    public Circle(DrawAPI drawAPI, int radius, int x, int y) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
