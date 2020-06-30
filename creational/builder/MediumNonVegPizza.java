package test.designPattern.creational.builder;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class MediumNonVegPizza extends test.designPatterns.creational.builder.NonVegPizza {
    @Override
    public String name() {
        return "Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Medium";
    }

    @Override
    public double price() {
        return 50.0;
    }
}
