package test.designPattern.creational.singleton;

/**
 * Created by Islombek Karimov on 10.03.2020.
 */
public class SingletonDemo {

    public static void main(String[] args) {
        String str = "Hello Java Singleton Pattern ";
        test.designPatterns.creational.singleton.Singleton first = test.designPatterns.creational.singleton.Singleton.getInstance(str);
        test.designPatterns.creational.singleton.Singleton second = test.designPatterns.creational.singleton.Singleton.getInstance(str);
        test.designPatterns.creational.singleton.Singleton third = test.designPatterns.creational.singleton.Singleton.getInstance(str);
        second.text = (second.text).toLowerCase();
        System.out.println(first.text);
        System.out.println(second.text);
        System.out.println(third.text);


    }
}
