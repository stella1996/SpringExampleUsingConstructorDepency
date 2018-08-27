package com.example.SpringExampleUsingConstructorDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springbeanxml.xml");

	    Student obj = (Student) context.getBean("e");
		System.out.println(obj.name+" "+"id is "+obj.id);
    }
}