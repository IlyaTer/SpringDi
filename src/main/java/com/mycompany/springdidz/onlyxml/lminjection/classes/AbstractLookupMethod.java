package com.mycompany.springdidz.onlyxml.lminjection.classes;

public abstract class AbstractLookupMethod implements DemoInterface{

    @Override
    public abstract SimpleInfoPrinter getSimpleInfoPrinter();

    @Override
    public void someOperation() {
        getSimpleInfoPrinter().printSomeThing();
    }
    
}
