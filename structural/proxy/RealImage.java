package test.designPattern.structural.proxy;

import test.designPatterns.structural.proxy.*;

/**
 * Created by Islombek Karimov on 18.06.2020.
 */
public class RealImage  implements test.designPatterns.structural.proxy.Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading: " + fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
