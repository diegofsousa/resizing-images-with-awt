package dev.diegofernando.imagetest.factory;

import java.awt.image.BufferedImage;

/**
 * @author Diego Fernando
 * @since 07/09/2020
 */

public abstract class Image {
    private BufferedImage originalImage;
    private int targetWidth;
    private int targetHeight;

    public Image(BufferedImage originalImage, int targetWidth, int targetHeight) {
        this.originalImage = originalImage;
        this.targetWidth = targetWidth;
        this.targetHeight = targetHeight;
    }

    public BufferedImage getOriginalImage() {
        return originalImage;
    }

    public int getTargetWidth() {
        return targetWidth;
    }

    public void setTargetWidth(int targetWidth) {
        this.targetWidth = targetWidth;
    }

    public int getTargetHeight() {
        return targetHeight;
    }

    public void setTargetHeight(int targetHeight) {
        this.targetHeight = targetHeight;
    }

    public abstract void resize();
}
