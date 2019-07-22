
package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


import java.sql.SQLOutput;

public class Main {

    public static void main(String[]args) {

//using application context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        Movie movie = context.getBean("movie", Movie.class);
//        Movie movie2 = context.getBean("movie2", Movie.class);

        System.out.println(movie);
//        System.out.println(movie2);




    }

}
