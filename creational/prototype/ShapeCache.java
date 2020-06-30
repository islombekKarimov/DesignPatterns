package test.designPattern.creational.prototype;

import test.designPatterns.creational.prototype.*;
import test.designPatterns.creational.prototype.Shape;
import test.designPatterns.creational.prototype.Square;

import java.util.Hashtable;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class ShapeCache {

    private static Hashtable<String, test.designPatterns.creational.prototype.Shape> shapeHashtable = new Hashtable<>();

    public static test.designPatterns.creational.prototype.Shape getShape(String shapeId) throws CloneNotSupportedException {
        test.designPatterns.creational.prototype.Shape cachedShape = shapeHashtable.get(shapeId);
        return (test.designPatterns.creational.prototype.Shape) cachedShape.clone();
    }

    public static void loadCache() throws CloneNotSupportedException {
        test.designPatterns.creational.prototype.Rectangle rectangle = new test.designPatterns.creational.prototype.Rectangle();
        rectangle.setId("1");
        shapeHashtable.put(rectangle.getId(), (test.designPatterns.creational.prototype.Shape) rectangle.clone());

        test.designPatterns.creational.prototype.Square square = new Square();
        square.setId("2");
        shapeHashtable.put(square.getId(), (Shape) square.clone());
    }
}
