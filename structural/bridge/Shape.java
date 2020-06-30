package test.designPattern.structural.bridge;

import test.designPatterns.structural.bridge.DrawAPI;

/**
 * Created by Islombek Karimov on 17.06.2020.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
