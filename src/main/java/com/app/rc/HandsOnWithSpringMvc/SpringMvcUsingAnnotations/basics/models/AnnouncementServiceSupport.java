
package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.basics.models;


import org.springframework.stereotype.Component;


@Component ( "announcement" )
public class AnnouncementServiceSupport
        implements
            ICustomerSupport {

    @Override
    public String customerSupport ( ) {
        return "Forwarding support request to Announcements - Night Hours";
    }
}