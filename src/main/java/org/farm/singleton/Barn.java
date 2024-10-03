package org.farm.singleton;

import org.farm.entity.food.Feed;

import java.util.ArrayList;
import java.util.List;

public class Barn implements Buildings {
    private static Barn instance;

    private List<Feed> sheepFood;

    private Barn() {
        sheepFood = new ArrayList<>();
    }

    public static Barn getInstance() {
        if (instance == null) {
            instance = new Barn();
        }
        return instance;
    }

    public List<Feed> getSheepFood() {
        return sheepFood;
    }

    public int showFood() {
        return sheepFood.size();
    }

    public void addFoodForSheep(Feed feed) {
        sheepFood.add(feed);
    }

}
