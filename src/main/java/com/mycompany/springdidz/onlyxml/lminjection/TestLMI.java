package com.mycompany.springdidz.onlyxml.lminjection;

import com.mycompany.springdidz.onlyxml.lminjection.classes.DemoInterface;
import com.mycompany.springdidz.onlyxml.lminjection.classes.SimpleInfoPrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestLMI {
    
    public static void main(String... args)
    {
        ApplicationContext context = new 
            FileSystemXmlApplicationContext("src/main/java/com/mycompany/"
                    + "springdidz/onlyxml/lminjection/config/SpringXMLConfig.xml");
        
        DemoInterface standartBean = context.getBean("standartBean",DemoInterface.class);
        DemoInterface abstractBean = context.getBean("abstractBean",DemoInterface.class);
        
        System.out.println("===================================================");
        System.out.println();
        
        System.out.println("Standart Bean:");
        lookupInfo(standartBean);
        
        System.out.println();
        
        System.out.println("Abstract Bean:");
        lookupInfo(abstractBean);
        
        System.out.println();
        System.out.println("===================================================");
        
        
    }//ena main
    
    private static void lookupInfo(DemoInterface demo)
    {
        SimpleInfoPrinter printer1 = demo.getSimpleInfoPrinter();
        SimpleInfoPrinter printer2 = demo.getSimpleInfoPrinter();
        
        System.out.println("SimpleInfoPrinter instances the Same?: " + 
                (printer1 == printer2));
    }
    
}//end class
