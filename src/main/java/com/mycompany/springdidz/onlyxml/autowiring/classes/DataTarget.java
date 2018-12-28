package com.mycompany.springdidz.onlyxml.autowiring.classes;

public class DataTarget {
    
    private Foo foo;
    private Bar bar;
    private Cafe cafe;

    public DataTarget() {
        System.out.println("Default constructor called");
    }

        
    public DataTarget(Foo foo, Bar bar, Cafe cafe) {
        System.out.println("Params constructor called");
        this.foo = foo;
        this.bar = bar;
        this.cafe = cafe;
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        System.out.println("Set Foo called");
        this.foo = foo;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        System.out.println("Set Bar called");
        this.bar = bar;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        System.out.println("Set Cafe called");
        this.cafe = cafe;
    }
    
    
}
