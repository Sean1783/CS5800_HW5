package org.restaurant.foods.basefood;

import org.restaurant.foods.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Burger implements Food {

    @Override
    public double getCost() {
        return 8.00;
    }

    @Override
    public List<String> getName() {
        List<String> list = new ArrayList<String>();
        list.add("Burger");
        return list;
    }

}
