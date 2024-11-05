package org.restaurant.foods.foodtopping;

import org.restaurant.foods.FoodDecorator;
import org.restaurant.foods.food.Food;

import java.util.List;

public class Cheese extends FoodDecorator {

    public Cheese(Food food) {
        super(food);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.00;
    }

    @Override
    public List<String> getName() {
        List<String> list = super.getName();
        list.add("Cheese");
        return list;
    }
}
