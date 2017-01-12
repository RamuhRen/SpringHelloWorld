package com.ecnu.spring.beans;

/**
 * Created by PC on 2017/1/12.
 */
public class HelloWorld {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println(this.name);
    }
}
