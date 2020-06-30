package test.designPattern.creational.factory;

import test.designPatterns.creational.factory.*;
import test.designPatterns.creational.factory.Circle;
import test.designPatterns.creational.factory.Rectangle;
import test.designPatterns.creational.factory.Square;

/**
 * Created by Islombek Karimov on 15.06.2020.
 */
public class ShapeFactory {

    public test.designPatterns.creational.factory.Shape getShapeType(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }

}
