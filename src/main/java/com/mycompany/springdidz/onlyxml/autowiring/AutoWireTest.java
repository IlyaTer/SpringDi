package com.mycompany.springdidz.onlyxml.autowiring;

import com.mycompany.springdidz.onlyxml.autowiring.classes.DataTarget;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AutoWireTest {
    
    public static void main(String... args)
    {
        ApplicationContext context = new 
            FileSystemXmlApplicationContext("src/main/java/com/mycompany/"
                    + "springdidz/onlyxml/autowiring/config/SpringXMLConfig.xml");
        
        
        System.out.println("===================================================");
        System.out.println();
                
        System.out.println("Using byName:");
        DataTarget targetByName = context.getBean("targetByName", DataTarget.class);
        System.out.println(targetByName);
        System.out.println("Using byType:");
        DataTarget targetByType = context.getBean("targetByType", DataTarget.class);
        System.out.println(targetByType);
        System.out.println("Using Constructor:");
        DataTarget targetConstructor = context.getBean("targetConstructor", DataTarget.class);
        System.out.println(targetConstructor);
        System.out.println("Using Default:");
        DataTarget targetDefault = context.getBean("targetDefault", DataTarget.class);
        System.out.println(targetDefault);
        
        System.out.println();
        System.out.println("===================================================");
        
    }//end main
}
