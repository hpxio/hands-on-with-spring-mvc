
package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingNoXml;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppStart {

    /**
     * @param args
     */
    public static void main ( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (
                GenreConfig.class );
        IMusicGenre genre = context.getBean ( "rnb",
                IMusicGenre.class );
        genre.defineGenre ( );

        // Using no component scan and DI //
        System.out.println (
                "Using no-component-scan and DI " );
        IMusicGenre trap = context.getBean ( "trapGenre",
                IMusicGenre.class );
        trap.defineGenre ( );
        context.close ( );
    }
}
