package com.mycompany.springdidz.onlyxml.spel.classes.cofigclass;

import java.util.Date;

public class AppConfig {
    
    private String name = "Herbert Schildt";
    private int age = 67;
    private double height = 181.5;
    private boolean programmer = true;
    private long ageInSeconds = new Date().getTime();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }
    
        
}
