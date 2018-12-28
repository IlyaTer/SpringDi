package com.mycompany.springdidz.onlyxml.lminjection.classes;

public class StandartLookupBean implements DemoInterface {

    private SimpleInfoPrinter simpleInfoPrinter;

    @Override
    public SimpleInfoPrinter getSimpleInfoPrinter() {
        return simpleInfoPrinter;
    }

    @Override
    public void someOperation() {
        simpleInfoPrinter.printSomeThing();
    }

    public void setSimpleInfoPrinter(SimpleInfoPrinter simpleInfoPrinter) {
        this.simpleInfoPrinter = simpleInfoPrinter;
    }

}
