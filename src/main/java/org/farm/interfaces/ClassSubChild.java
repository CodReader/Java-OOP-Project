package org.farm.interfaces;

public class ClassSubChild implements SubChild {
    @Override
    public void childFunctionality() {
        System.out.println("subChild implementation of CHILD ");
    }

    @Override
    public void parrentFunctionalit() {
        System.out.println("subChild implementation of PARENT ");
    }

    @Override
    public void subChildFunctionality() {
        System.out.println("subChild implementation of SUBCHILD ");
    }
}
