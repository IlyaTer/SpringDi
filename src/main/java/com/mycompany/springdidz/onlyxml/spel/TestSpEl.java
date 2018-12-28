package com.mycompany.springdidz.onlyxml.spel;

import com.mycompany.springdidz.onlyxml.spel.classes.cofigclass.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpEl {
    
    public static void main(String... args)
    {
        ApplicationContext context = new 
            FileSystemXmlApplicationContext("src/main/java/com/mycompany/"
                    + "springdidz/onlyxml/spel/config/SpringXMLConfig.xml");
        
        
        AppConfig defaultBean = context.getBean("injectSimpleConfig", AppConfig.class);
        AppConfig editBean = context.getBean("injectSimpleSpel", AppConfig.class);
        
        System.out.println("===================================================");
        System.out.println();
        
        showData(defaultBean);
        System.out.println();
        showData(editBean);
                
        System.out.println();
        System.out.println("===================================================");
    }//end main
    
    private static void showData(AppConfig app)
    {
        System.out.println(app.getName());
        System.out.println(app.getAge());
        System.out.println(app.getHeight());
        System.out.println(app.isProgrammer());
        System.out.println(app.getAgeInSeconds());
    }
}
