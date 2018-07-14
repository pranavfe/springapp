package com.pranav.demospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        
//       ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//       Alien obj= (Alien)context.getBean("alien");
//       Alien obj1= (Alien)context.getBean("alien");
//       obj1.setAname("changed");
//       obj1.show();
//       obj.show();
//       System.out.println("obj="+obj.hashCode());
//       System.out.println("obj1="+obj1.hashCode());
//       Buyer det =(Buyer)context.getBean("buyer");
//       det.laptopdetails();
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	Buyer obj=(Buyer)context.getBean("alien");
    	obj.laptopdetails();
    	
    	
    }
}
