package com.yash.springiocAssignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        
        Vehicle veh = (Vehicle) context.getBean("vehicle2");
        veh.display();
        System.out.println();
        vehicle.display();
    }
}
