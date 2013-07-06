/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pratchaya.ws.adaptor;

import com.sun.jersey.api.core.PackagesResourceConfig;
import javax.ws.rs.ApplicationPath;

/**
 *
 * @author pratchaya
 */
@ApplicationPath("/")
public class RestJsonApplication extends PackagesResourceConfig {

    public RestJsonApplication() {

        super("com.pratchaya.ws.rs.service");

    }
    
}
