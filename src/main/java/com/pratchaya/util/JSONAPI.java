/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pratchaya.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author pratchaya
 */
public class JSONAPI {

    private String data;

    public JSONAPI(String data) {
        this.data = data;
    }

    public String JSONExtract() {
        String pure = null;
        try {
            JSONObject json = new JSONObject(getData());
            List<String> list = new ArrayList<String>();
            JSONArray arr = json.getJSONArray("Image");
            list.add(arr.getJSONObject(0).getString("image"));
            pure = list.get(0).replaceFirst(".*base64,", "");
        } catch (JSONException ex) {
            Logger.getLogger(JSONAPI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pure;

    }

    public static List<String> JSONArchive() {

        JSONObject jsonC = new JSONObject();
        Map map = new LinkedHashMap();
        List list = new LinkedList();

        list.add(map);

        return list;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
}
