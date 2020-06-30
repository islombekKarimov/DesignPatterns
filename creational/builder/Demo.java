package test.designPattern.creational.builder;


import test.designPatterns.creational.builder.OrderBuilder;
import test.designPatterns.creational.builder.OrderedItems;

/**
 * Created by Islombek Karimov on 14.03.2020.
 */
public class Demo {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();

        OrderedItems vegPizza = orderBuilder.prepareVegPizza();

        System.out.println("Veg Pizza");
        vegPizza.showItem();
        System.out.println("Total cost: " + vegPizza.getCost());
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        OrderedItems nonVegPizza = orderBuilder.prepareNonVegPizza();
        System.out.println("Non-Veg Pizza");
        nonVegPizza.showItem();
        System.out.println("Total cost: " + nonVegPizza.getCost());
    }

}
