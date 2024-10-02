package org.farm.singleton;

public class Barn implements Buildings {
    private static Barn instance;
    private final int[] sheepFood;

    private Barn(int[] sheepFood) {
        this.sheepFood = sheepFood;
    }

    public static Barn getInstance(int sheepFood[]) {
        if (instance == null) {
            instance = new Barn(new int[]{100});
        }
        return instance;
    }
}
