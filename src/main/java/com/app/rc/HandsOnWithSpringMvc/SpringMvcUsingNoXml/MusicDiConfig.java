package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingNoXml;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MusicDiConfig {

    @Bean
    public IMusicInstrument set808Instrument ( ) {
        return new Set808 ( );
    }

    @Bean
    public IMusicGenre trapGenre() {
        return new TrapGenre ( set808Instrument ( ) );
    }
}
