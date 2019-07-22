package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemo;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class
Main {

    public  static  void main(String args []) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook(); // this is to destroy the object.

        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) applicationContext.getBean("cycle");
// getting the bean of post processing to display lifecycle of bean
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = applicationContext.getBean("postprocessing",BeanPostProcessorDemoBean.class);

      
    }
}
