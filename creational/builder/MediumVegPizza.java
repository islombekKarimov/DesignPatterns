package test.designPattern.creational.builder;

import test.designPatterns.creational.builder.*;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class MediumVegPizza extends test.designPatterns.creational.builder.VegPizza {
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
