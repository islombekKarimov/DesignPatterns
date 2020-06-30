package test.designPattern.creational.builder;


/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class MediumVegPizza extends VegPizza {
    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }

    @Override
    public double price() {
        return 30.0;
    }
}
