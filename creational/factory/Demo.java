package test.designPattern.creational.factory;


/**
 * Created by Islombek Karimov on 15.06.2020.
 */
public class Demo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape firstShape = shapeFactory.getShapeType("Rectangle");
        firstShape.drow();
        Shape secondShape = shapeFactory.getShapeType("Circle");
        secondShape.drow();
        Shape thirdShape = shapeFactory.getShapeType("Square");
        thirdShape.drow();
    }

}
