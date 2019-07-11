
package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main {

    public static void main(String[]args) {

//using application context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie = context.getBean("movie", Movie.class);
        movie.display();


//using XmlBeanFactory
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("resources/beans.xml"));
        Movie mov = factory.getBean("movie",Movie.class);
        mov.display();


        //Using BeanDefinitionRegistry and BeanDefinitionReader
        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader =new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

        Movie movv=((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie",Movie.class);
        movv.display();

    }

}
