package com.yash.springIOCAssignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class DrawShape 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       
       Rectangle r = (Rectangle) context.getBean("rectangle");
       r.draw();
       
       Triangle t = (Triangle) context.getBean("triangle");
       t.draw();
       
       Parallelogram p = (Parallelogram) context.getBean("parallelogram");
       p.draw();
    }
}
