package test.designPattern.structural.proxy;

import test.designPatterns.structural.proxy.Image;
import test.designPatterns.structural.proxy.ProxyImage;

/**
 * Created by Islombek Karimov on 18.06.2020.
 */
public class Demo {

    public static void main(String[] args) {
        Image image = new ProxyImage("picture.jpg");
        image.display();
        System.out.println(" ");
        image.display();
    }
}
