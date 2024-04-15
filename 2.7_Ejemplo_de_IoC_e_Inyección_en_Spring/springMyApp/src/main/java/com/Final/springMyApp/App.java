package com.Final.springMyApp;

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
    	
        /*---------------------Viking Instance (annotations)------------------------------*/
    	System.out.println("-----Viking Instance (annotations)---");
	   	 AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(GameConfig.class);
	   	 Viking viking = context2.getBean("viking", Viking.class);
	   	 
	   	/*-------------------Samurai Intance (@bean)----------------------*/
	   
	   	 Samurai samurai1= context2.getBean("createSamurai",Samurai.class);
	   	 Samurai samurai2= context2.getBean("createSamurai",Samurai.class);
	   	 
    	/*----------------------Dragon from xml------------*/
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Dragon dragon = context.getBean("myDragon", Dragon.class);
       Dragon samedragon = context.getBean("myDragon", Dragon.class);
       
       /*----------Show Dragon Singleton--------------*/
       System.out.println("-------Show Dragon Singleton------");
       dragon.receiveAttack(55);
       System.out.println(dragon.getHealth());
       samedragon.receiveAttack(100);
       System.out.println(samedragon.getHealth());
       
       /*----------Show Samurai Prototype--------------*/
       System.out.println("-------Show Samurai Prototype------");
       samurai1.reciveDamage(50);
       System.out.println(samurai1.getHealth());
       samurai2.reciveDamage(50);
       System.out.println(samurai2.getHealth());
       
       context2.close();
       context.close();
       
       
    }
}
