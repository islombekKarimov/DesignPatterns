package test.designPattern.creational.prototype;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class Rectangle extends test.designPatterns.creational.prototype.Shape {

    private String type;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void drow() {
        System.out.println("Inside Rectangle");
    }
}
