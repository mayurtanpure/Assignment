package com.yash.SpringIOCAssignment1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
		
		  City c = (City) context.getBean("city");
		  c.display();
		  
		  
		  
		 CinemaHall ci = (CinemaHall) context.getBean("cinemaHall1");
		
		  
		 
		 
    	 

    	
    }
}
