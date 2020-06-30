package test.designPattern.creational.prototype;


import java.util.Hashtable;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeHashtable.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() throws CloneNotSupportedException {
       Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeHashtable.put(rectangle.getId(), (Shape) rectangle.clone());

       Square square = new Square();
        square.setId("2");
        shapeHashtable.put(square.getId(), (Shape) square.clone());
    }
}
