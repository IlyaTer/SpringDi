package com.mycompany.springdidz.onlyxml.inheritanceofbeans;

import com.mycompany.springdidz.onlyxml.inheritanceofbeans.classes.OtherMessage;
import com.mycompany.springdidz.onlyxml.inheritanceofbeans.classes.SimpleMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestInhert {
    
    public static void main(String... args)
    {
        ApplicationContext context = new 
            FileSystemXmlApplicationContext("src/main/java/com/mycompany/springdidz/onlyxml/"
                    + "inheritanceofbeans/config/SpringXMLConfig.xml");
        
        SimpleMessage simpMessage = 
                context.getBean("simpleBean", SimpleMessage.class);
        
        OtherMessage otherMessage = 
                context.getBean("otherBean", OtherMessage.class);
        
        System.out.println("=================================================");
        
        System.out.println(simpMessage.getMessage1());
        System.out.println(simpMessage.getMessage2());
        
        System.out.println();
        
        System.out.println(otherMessage.getMessage1());
        System.out.println(otherMessage.getMessage2());
        System.out.println(otherMessage.getMessage3());
        
        System.out.println("=================================================");
    }
    
}
