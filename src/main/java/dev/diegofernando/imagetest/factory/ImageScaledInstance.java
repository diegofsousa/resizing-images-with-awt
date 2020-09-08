package dev.diegofernando.imagetest.factory;

import dev.diegofernando.imagetest.util.ImageResourceUtil;

import java.awt.image.BufferedImage;

/**
 * @author Diego Fernando
 * @since 07/09/2020
 */

public class ImageScaledInstance extends Image{
    public ImageScaledInstance(BufferedImage originalImage, int targetWidth, int targetHeight) {
        super(originalImage, targetWidth, targetHeight);
    }

    public void resize(){
        System.out.println("Convertendo imagem usando ImageScaledInstance...");
        java.awt.Image resultingImage = this.getOriginalImage().getScaledInstance(this.getTargetWidth(), this.getTargetHeight(), java.awt.Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(this.getTargetWidth(), this.getTargetHeight(), BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);

        ImageResourceUtil.saveImage(outputImage, "scaledinstance");
    }
}
