/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastserve.aawp;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author user
 */
@Path("appUserFeedback")
@Singleton
public class AppUserFeedbackResource {

    private static final Logger logger = LoggerFactory.getLogger(AppUserFeedbackResource.class.getName());
    
    
    @GET
    @Produces("application/json")
    public String findAppUserFeedback(@QueryParam("ps") int pageSize,
            @QueryParam("pn") int pageNumber, HttpHeaders headers) {
        logger.info("Hello   World!!" + headers.toString());
        return "Hello World!!";
        
    }

   
}
