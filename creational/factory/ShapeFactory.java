package test.designPattern.creational.factory;


/**
 * Created by Islombek Karimov on 15.06.2020.
 */
public class ShapeFactory {

    public Shape getShapeType(String shapeType){
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
