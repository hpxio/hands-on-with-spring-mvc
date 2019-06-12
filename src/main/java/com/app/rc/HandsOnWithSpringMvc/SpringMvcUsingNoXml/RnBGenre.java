
package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingNoXml;

import org.springframework.stereotype.Component;


@Component ( "rnb" )
public class RnBGenre implements IMusicGenre {

    @Override
    public void defineGenre ( ) {
        System.out.println ( "This is RnB" );
    }
}
