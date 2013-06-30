/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pratchaya.util;

import static com.googlecode.javacv.cpp.opencv_core.*;
import static com.googlecode.javacv.cpp.opencv_imgproc.*;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
import java.awt.image.BufferedImage;

/**
 *
 * @author pratchaya
 */
public class ImageCV {

    public static BufferedImage convert(BufferedImage img) {
        BufferedImage cl = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
        IplImage bin = cvCreateImage(cvSize(img.getWidth(), img.getHeight()), 8, 1);
        bin = IplImage.createFrom(img);
        IplImage firstFramegray = cvCreateImage(cvGetSize(bin), IPL_DEPTH_8U, 1);
        cvCvtColor(bin, firstFramegray, CV_BGR2GRAY);
        cl = firstFramegray.getBufferedImage();

        return cl;
    }
}
