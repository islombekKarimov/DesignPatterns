package test.designPattern.creational.builder;

import test.designPatterns.creational.builder.MediumNonVegPizza;
import test.designPatterns.creational.builder.MediumVegPizza;
import test.designPatterns.creational.builder.OrderedItems;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class OrderBuilder {

    public OrderedItems prepareVegPizza() {
        OrderedItems orderedItems = new OrderedItems();
        orderedItems.addItem(new MediumVegPizza());
        orderedItems.addItem(new test.designPatterns.creational.builder.MediumPepsi());
        return orderedItems;
    }

    public OrderedItems prepareNonVegPizza() {
        OrderedItems orderedItems = new OrderedItems();
        orderedItems.addItem(new MediumNonVegPizza());
        orderedItems.addItem(new test.designPatterns.creational.builder.MediumPepsi());
        return orderedItems;
    }

}
