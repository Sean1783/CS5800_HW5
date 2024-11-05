package org.restaurant.foods;

import org.restaurant.foods.food.Food;

import java.util.List;

public class FoodDecorator implements Food {

    protected Food food;

    public FoodDecorator(final Food food) {
        this.food = food;
    }

    @Override
    public double getCost() {
        return food.getCost();
    }

    @Override
    public List<String> getName() {
        return food.getName();
    }

}
