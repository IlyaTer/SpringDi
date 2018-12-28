package com.mycompany.springdidz.onlyxml.simpleinjection.classes.renders;

import com.mycompany.springdidz.onlyxml.simpleinjection.interfaces.provider.IMessageProvider;
import com.mycompany.springdidz.onlyxml.simpleinjection.interfaces.render.IMessagerender;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;

public class SimpleMessageRender implements IMessagerender, InitializingBean{

    private IMessageProvider provider;
    private String simpleStr;
    private List list;
    private Set set;
    private Map<String, Object> map;

    public SimpleMessageRender(String simpleStr) {
        this.simpleStr = simpleStr;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
    
    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
    
    @PostConstruct
    public void pc()
    {
        System.out.println("PostConstruct");
    }
       
    @Override
    public void render() {
        if(provider == null)
        {
            throw new NullPointerException("provider has not been initialized");
        }
        else
        {
            System.out.println(provider.getMessage());
            System.out.println(simpleStr);
            System.out.println(list);
            System.out.println(set);
            System.out.println(map);
        }
    }

    public IMessageProvider getProvider() {
        return provider;
    }

    public void setProvider(IMessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am alive!");
    }

    
    
  
}
