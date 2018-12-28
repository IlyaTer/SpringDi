package com.mycompany.springdidz.onlyxml.simpleinjection;

import com.mycompany.springdidz.onlyxml.simpleinjection.interfaces.render.IMessagerender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
    
    public static void main(String... args)
    {
        ApplicationContext context = new 
            FileSystemXmlApplicationContext("src/main/java/com/mycompany/"
                    + "springdidz/onlyxml/config/newSpringXMLConfig.xml");
        
        IMessagerender render = context.getBean("simpleRender", IMessagerender.class);
        
        System.out.println("===================================================");
        System.out.println();
        
        render.render();
        
        System.out.println();
        System.out.println("===================================================");
    }
}
