package test.designPattern.creational.singleton;

/**
 * Created by Islombek Karimov on 10.03.2020.
 */
public class Singleton {
    private static Singleton initialize;
    public String text;

    private Singleton(String text) {
        this.text = text;
    }

    public static Singleton getInstance(String text) {
        if (initialize == null) {

            initialize = new Singleton(text);
        }
        return initialize;
    }

}
