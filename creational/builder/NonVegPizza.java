package test.designPattern.creational.builder;


/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public abstract class NonVegPizza implements Items {
    @Override
    public abstract String name();

    @Override
    public abstract String size();

    @Override
    public abstract double price();
}
