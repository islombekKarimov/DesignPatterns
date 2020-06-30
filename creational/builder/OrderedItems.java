package test.designPattern.creational.builder;

import test.designPatterns.creational.builder.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public class OrderedItems {

    List<test.designPatterns.creational.builder.Items> itemsList = new ArrayList<>();

    public void addItem(test.designPatterns.creational.builder.Items items) {
        itemsList.add(items);
    }

    public double getCost() {
        double cost = 0;
        for (test.designPatterns.creational.builder.Items items : itemsList) {
            cost += items.price();
        }
        return cost;
    }

    public void showItem() {
        for (test.designPatterns.creational.builder.Items items : itemsList) {
            System.out.println("Item is : " + items.name());
            System.out.println("Size is : " + items.size());
            System.out.println("Price is : " + items.price());
        }
    }
}
