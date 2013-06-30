/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pratchaya.util;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author pratchaya
 */
public class ImageReader {
    // get image form url to BufferedImage

    public static BufferedImage load_image(String url) {
        // init BufferedImage null
        BufferedImage image = null;
        try {
            // read file form BufferedImage
            image = ImageIO.read(new File(url));
            if (!image.equals(null)) {
            }

        } catch (Exception e) {
        }
        // return result image when read url done!
        return image;
    }
}
