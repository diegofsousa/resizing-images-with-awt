package dev.diegofernando.imagetest.factory;

import dev.diegofernando.imagetest.util.ImageResourceUtil;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author Diego Fernando
 * @since 07/09/2020
 */

public class ImageGraphics2DWithRendering extends Image{
    public ImageGraphics2DWithRendering(BufferedImage originalImage, int targetWidth, int targetHeight) {
        super(originalImage, targetWidth, targetHeight);
    }

    public void resize(){
        System.out.println("Convertendo imagem usando Graphics2D renderizado...");
        BufferedImage resizedImage = new BufferedImage(this.getTargetWidth(), this.getTargetHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(this.getOriginalImage(), 0, 0, this.getTargetWidth(), this.getTargetHeight(), null);
        graphics2D.dispose();
        ImageResourceUtil.saveImage(resizedImage, "graphics2rendered");
    }
}
