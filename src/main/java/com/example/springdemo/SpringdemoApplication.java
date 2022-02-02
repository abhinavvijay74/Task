package com.example.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringdemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("configuration.xml");
        Demo d1=applicationContext.getBean("demo",Demo.class);
        System.out.println(d1);


    }


}
