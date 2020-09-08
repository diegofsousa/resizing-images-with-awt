package dev.diegofernando.imagetest.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author Diego Fernando
 * @since 07/09/2020
 */

public class ImageResourceUtil {
    public static BufferedImage getImageFromPath(String path){
        try {
            URL resource = ImageResourceUtil.class.getClassLoader().getResource(path);
            return ImageIO.read(new File(resource.toURI()));
        } catch (IOException ex){
            ex.printStackTrace();
            throw new RuntimeException();
        } catch (URISyntaxException ex){
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void saveImage(BufferedImage image, String title){
        try {
            LocalDateTime ldt = LocalDateTime.now();
            Long ldtMillis = ldt.toEpochSecond(ZoneOffset.UTC);

            String imageAbusolute = Paths.get("src","main","resources")
                    .toUri().getPath() +"/"+ title + ldtMillis.toString() + ".jpg";

            File outputfile = new File(imageAbusolute);
            ImageIO.write(image, "jpg", outputfile);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }
}
