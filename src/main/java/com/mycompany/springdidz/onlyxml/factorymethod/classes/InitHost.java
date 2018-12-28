
package com.mycompany.springdidz.onlyxml.factorymethod.classes;

public class InitHost {
    
    private String name = "Default";
    private int port = 1111;
    private String description = "Default descriptions";

    
    Host hostInstance()
    {
        return new Host(name, port, description);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}//end class
