package com.mycompany.springdidz.onlyxml.factorymethod;

import com.mycompany.springdidz.onlyxml.factorymethod.classes.Host;
import com.mycompany.springdidz.onlyxml.factorymethod.classes.Hosts;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestFactoryMethod {
    
    public static void main(String... args)
    {
        ApplicationContext context = new 
            FileSystemXmlApplicationContext("src/main/java/com/mycompany/"
                    + "springdidz/onlyxml/factorymethod/config/SpringXMLConfig.xml");
        
        Hosts hosts = context.getBean("hostsFactory", Hosts.class);
        
        System.out.println("===================================================");
        System.out.println();
        
        printHosts(hosts.getHost1());
        System.out.println();
        printHosts(hosts.getHost2());
        
        System.out.println();
        System.out.println("===================================================");
        
    }//end main
    
    
    private static void printHosts(Host host)
    {
        System.out.println(host.getName());
        System.out.println(host.getPort());
        System.out.println(host.getDescription());
    }
}
