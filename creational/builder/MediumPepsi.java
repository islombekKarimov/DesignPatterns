package test.designPattern.creational.builder;

import test.designPatterns.creational.builder.*;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class MediumPepsi extends test.designPatterns.creational.builder.Pepsi {
    @Override
    public String name() {
        return "Pepsi 1L";
    }

    @Override
    public String size() {
        return "Medium";
    }

    @Override
    public double price() {
        return 10.0;
    }
}
