package test.designPattern.creational.prototype;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class Square extends Shape {
   String type ;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public Square() {
        type = "Square";
    }

    @Override
    void drow() {
        System.out.println("Inside Square");
    }
}
