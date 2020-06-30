package test.designPattern.creational.builder;


/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class OrderBuilder {

    public OrderedItems prepareVegPizza() {
        OrderedItems orderedItems = new OrderedItems();
        orderedItems.addItem(new MediumVegPizza());
        orderedItems.addItem(new MediumPepsi());
        return orderedItems;
    }

    public OrderedItems prepareNonVegPizza() {
        OrderedItems orderedItems = new OrderedItems();
        orderedItems.addItem(new MediumNonVegPizza());
        orderedItems.addItem(new MediumPepsi());
        return orderedItems;
    }

}
