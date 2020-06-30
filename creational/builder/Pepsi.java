package test.designPattern.creational.builder;

import test.designPatterns.creational.builder.ColdDrink;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public abstract class Pepsi extends ColdDrink {
    @Override
    public abstract String name();

    @Override
    public abstract String size();

    @Override
    public abstract double price();
}
