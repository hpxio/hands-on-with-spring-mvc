
package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingNoXml;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component ( "trap" )
public class TrapGenre implements IMusicGenre {

    IMusicInstrument instrument;


    public TrapGenre (
            @Qualifier ( "set808" ) IMusicInstrument instrument ) {
        this.instrument = instrument;
    }

    @Override
    public void defineGenre ( ) {
        System.out.println ( "This is Trap" );
    }
}
