/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pratchaya.xml;

/**
 *
 * @author suputsopon
 */
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class ItemCreate {

    private String count, broken, unbroken, imageBefore, imageAfter;

    public ItemCreate() {
    }

    public ItemCreate(String count, String broken, String unbroken, String imageBefore, String imageAfter) {

        this.count = count;
        this.broken = broken;
        this.unbroken = unbroken;
        this.imageBefore = imageBefore;
        this.imageAfter = imageAfter;

    }

    /**
     * @return the count
     */
    public String getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * @return the broken
     */
    public String getBroken() {
        return broken;
    }

    /**
     * @param broken the broken to set
     */
    public void setBroken(String broken) {
        this.broken = broken;
    }

    /**
     * @return the unbroken
     */
    public String getUnbroken() {
        return unbroken;
    }

    /**
     * @param unbroken the unbroken to set
     */
    public void setUnbroken(String unbroken) {
        this.unbroken = unbroken;
    }

    /**
     * @return the imageBefore
     */
    public String getImageBefore() {
        return imageBefore;
    }

    /**
     * @param imageBefore the imageBefore to set
     */
    public void setImageBefore(String imageBefore) {
        this.imageBefore = imageBefore;
    }

    /**
     * @return the imageAfter
     */
    public String getImageAfter() {
        return imageAfter;
    }

    /**
     * @param imageAfter the imageAfter to set
     */
    public void setImageAfter(String imageAfter) {
        this.imageAfter = imageAfter;
    }
}
