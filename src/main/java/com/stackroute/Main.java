package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemo;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public  static  void main(String args []) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();

        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) applicationContext.getBean("cycle");

        BeanPostProcessorDemoBean beanPostProcessorDemoBean = applicationContext.getBean("postprocessing",BeanPostProcessorDemoBean.class);

    }
}
