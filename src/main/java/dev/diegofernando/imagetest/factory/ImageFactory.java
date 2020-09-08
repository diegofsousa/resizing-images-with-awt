package dev.diegofernando.imagetest.factory;

import java.awt.image.BufferedImage;

/**
 * @author Diego Fernando
 * @since 07/09/2020
 */

public abstract class ImageFactory {
    public abstract ImageGraphics2D resizeWithGraphics2D(BufferedImage originalImage, int targetWidth, int targetHeight);
    public abstract ImageGraphics2DWithRendering resizeWithGraphics2DRendered(BufferedImage originalImage, int targetWidth, int targetHeight);
    public abstract ImageScaledInstance resizeWithScaledInstance(BufferedImage originalImage, int targetWidth, int targetHeight);
}
