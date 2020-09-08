package dev.diegofernando.imagetest.factory;

import java.awt.image.BufferedImage;

/**
 * @author Diego Fernando
 * @since 07/09/2020
 */

public class ConcreteImageFactory extends ImageFactory{
    public ImageGraphics2D resizeWithGraphics2D(BufferedImage originalImage, int targetWidth, int targetHeight) {
        return new ImageGraphics2D(originalImage, targetWidth, targetHeight);
    }

    public ImageGraphics2DWithRendering resizeWithGraphics2DRendered(BufferedImage originalImage, int targetWidth, int targetHeight) {
        return new ImageGraphics2DWithRendering(originalImage, targetWidth, targetHeight);
    }

    public ImageScaledInstance resizeWithScaledInstance(BufferedImage originalImage, int targetWidth, int targetHeight) {
        return new ImageScaledInstance(originalImage, targetWidth, targetHeight);
    }
}
