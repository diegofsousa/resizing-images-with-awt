package dev.diegofernando.imagetest;

import dev.diegofernando.imagetest.factory.ConcreteImageFactory;
import dev.diegofernando.imagetest.factory.Image;
import dev.diegofernando.imagetest.factory.ImageFactory;
import dev.diegofernando.imagetest.util.ImageResourceUtil;

import java.awt.image.BufferedImage;

/**
 * @author Diego Fernando
 * @since 07/09/2020
 */

public class Main {
    public static void main(String[] args){
        BufferedImage image = ImageResourceUtil.getImageFromPath("oeiras.jpg");

        ImageFactory imageFactory = new ConcreteImageFactory();

        Image graphics2dImage = imageFactory.resizeWithGraphics2D(image, 200, 200);
        Image scaledInstanceImage = imageFactory.resizeWithScaledInstance(image, 200, 200);
        Image graphics2dRenderedImage = imageFactory.resizeWithGraphics2DRendered(image, 200, 200);

        graphics2dImage.resize();
        scaledInstanceImage.resize();
        graphics2dRenderedImage.resize();
    }
}
