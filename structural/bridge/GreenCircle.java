package test.designPattern.structural.bridge;

import test.designPatterns.structural.bridge.*;

/**
 * Created by Islombek Karimov on 17.06.2020.
 */
public class GreenCircle implements test.designPatterns.structural.bridge.DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color: green, radius: " + radius + ", x: " + x + ", y: " + y);

    }
}
