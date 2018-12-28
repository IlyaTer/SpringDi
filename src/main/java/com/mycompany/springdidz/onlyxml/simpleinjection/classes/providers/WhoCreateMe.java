package com.mycompany.springdidz.onlyxml.simpleinjection.classes.providers;

import com.mycompany.springdidz.onlyxml.simpleinjection.interfaces.provider.IMessageProvider;
import org.springframework.beans.factory.InitializingBean;

public class WhoCreateMe implements IMessageProvider, InitializingBean {

    private String nameCreator = "Ilya Terekhoff";
    
    @Override
    public String getMessage() {
        return "Name of my creator is " + nameCreator;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("WhoCreateMe is alive!");
    }
    
    

}
