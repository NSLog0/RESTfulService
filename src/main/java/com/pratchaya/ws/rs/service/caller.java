/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pratchaya.ws.rs.service;

import static com.googlecode.javacv.cpp.opencv_core.*;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
import com.pratchaya.util.ImageUtils;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author pratchaya
 */
public class caller {
//
//    public static IplImage imageToCv(BufferedImage input) {
//        if (input.getType() != BufferedImage.TYPE_BYTE_GRAY && input.getType() != BufferedImage.TYPE_3BYTE_BGR) {
//            // convert it to a BufferedImage with a component order that matches the OpenCV order
//            BufferedImage tmp = new BufferedImage(input.getWidth(), input.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
//            Graphics2D g = tmp.createGraphics();
//            g.drawImage(input, 0, 0, null);
//            g.dispose();
//            input = tmp;
//        }
//        return IplImage.createFrom(input);
//    }
//
//    public static BufferedImage con(String data) {
//
//        BufferedImage i = new BufferedImage(480, 360, BufferedImage.TYPE_INT_BGR);
//
//        try {
//            String d = data;
//
//
//            JSONObject json = new JSONObject(data);
//            List<String> l = new ArrayList<String>();
//            JSONArray arr = json.getJSONArray("Image");
//            l.add(arr.getJSONObject(0).getString("image"));
//          //  IplImage b = imageToCv(ImageUtils.decodeToImage(l.get(0)));
//           
//        } catch (JSONException ex) {
//            Logger.getLogger(caller.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return i;
//    }
}
