package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingNoXml;

import org.springframework.stereotype.Component;

@Component
public class Set808 implements IMusicInstrument {

    @Override
    public void instrument ( ) {
        System.out
                .println ( "This is 808 Retro Trap maker" );
    }

}
