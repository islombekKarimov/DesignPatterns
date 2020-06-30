package test.designPattern.structural.proxy;

import test.designPatterns.structural.proxy.*;
import test.designPatterns.structural.proxy.RealImage;

/**
 * Created by Islombek Karimov on 18.06.2020.
 */
public class ProxyImage implements test.designPatterns.structural.proxy.Image {
    private String fileImage;
    private test.designPatterns.structural.proxy.RealImage realImage;

    public ProxyImage(String fileImage) {
        this.fileImage = fileImage;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileImage);
        }
        realImage.display();
    }
}
