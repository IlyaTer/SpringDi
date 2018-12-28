package com.mycompany.springdidz.onlyxml.factorymethod.classes;

public class Host {
    
    private String name;
    private int port;
    private String description;

    public Host(String name, int port, String description) {
        this.name = name;
        this.port = port;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPort() {
        return port;
    }

    public String getDescription() {
        return description;
    }
    
}//end class
