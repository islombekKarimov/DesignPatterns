package test.designPattern.creational.prototype;

import test.designPatterns.creational.prototype.Shape;
import test.designPatterns.creational.prototype.ShapeCache;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());
    }

}
