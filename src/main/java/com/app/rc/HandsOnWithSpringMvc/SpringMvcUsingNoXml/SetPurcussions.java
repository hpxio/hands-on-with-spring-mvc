package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingNoXml;

import org.springframework.stereotype.Component;

@Component
public class SetPurcussions implements IMusicInstrument {

    @Override
    public void instrument ( ) {
        System.out.println (
                "This is Purcussion set for Trap and RnB" );
    }

}
