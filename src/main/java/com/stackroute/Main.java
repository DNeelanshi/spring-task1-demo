
package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[]args) {

//using application context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//scope=singleton
        Movie movie1 = context.getBean("movie1", Movie.class);
        movie1.display();

        Movie movieB = context.getBean("movie1", Movie.class);
        movie1.display();

        Movie movie2 = context.getBean("movie2", Movie.class);
        movie2.display();

        Movie movie3 = context.getBean("movie3", Movie.class);
        movie3.display();
        
//scope= prototype
        Movie movie4 = context.getBean("movie4", Movie.class);
        movie4.display();

        Movie movie5 = context.getBean("movie4", Movie.class);
        movie5.display();    //gives null
        
        System.out.println(movie1 == movieB);
        

    }

}
