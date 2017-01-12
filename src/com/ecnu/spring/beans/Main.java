package com.ecnu.spring.beans;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by PC on 2017/1/12.
 */
public class Main {
    public static void main(String[] args){
        //HelloWorld helloWorld = new HelloWorld();
        // helloWorld.setName("a");
        /* 创建IOC容器*
        applicationContext 代表IOC容器
        */
        /*路径有两类 ClassPathXmlApplicationContext和FileSystemXmlApplicationContext*/
        ApplicationContext test = new ClassPathXmlApplicationContext("appConfig.xml");
        HelloWorld helloWorld = (HelloWorld) test.getBean("helloWorld");
        helloWorld.printName();

        ApplicationContext text1 = new ClassPathXmlApplicationContext("appConfig.xml");
        car testCar = (car) text1.getBean("testcar");
        System.out.println(testCar);
    }
}
