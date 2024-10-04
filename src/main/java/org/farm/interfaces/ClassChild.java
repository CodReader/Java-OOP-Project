package org.farm.interfaces;

public class ClassChild implements Child {
    @Override
    public void childFunctionality() {
        System.out.println("child Child implementation");
    }

    @Override
    public void parrentFunctionalit() {
        System.out.println("child Parent implementation");
    }
}
