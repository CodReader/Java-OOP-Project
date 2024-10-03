package org.farm;

import org.farm.entity.animal.Bull;
import org.farm.singleton.Barn;

public class Main {
    public static void main(String[] args) {
        var barn = Barn.getInstance();
        Bull bull = new Bull("ReadHeadBulld",200);
        bull.getBreed();
        bull.getWeight();
        System.out.println("Bull info" + bull.performFly());
    }
}