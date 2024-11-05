package org.restaurant.foods.foodtopping;

import org.restaurant.foods.FoodDecorator;
import org.restaurant.foods.food.Food;

import java.util.List;

public class Onion extends FoodDecorator {
    public Onion(Food food) {
        super(food);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public List<String> getName() {
        List<String> list = super.getName();
        list.add("Onion");
        return list;
    }

}
