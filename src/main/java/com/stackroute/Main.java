
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

import java.sql.SQLOutput;

public class Main {

    public static void main(String[]args) {

//using application context
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo=(BeanLifeCycleDemo) applicationContext.getBean("cycle");


    }

    public void afterPropertiesSet () throws Exception {
        System.out.println("After properties init");

    }
    public void initialize ()
    {
        System.out.println("Initialization");
    }

    public  void clean()
    {
        System.out.println("custom destroy");
    }
    public void destroy ()
    {
        System.out.println("Destroy");
    }



}
