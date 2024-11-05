package org.restaurant;

import org.restaurant.foods.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private ArrayList<Food> orderList;

    public Order() {
        orderList = new ArrayList<>();
    }

    public void addItem(Food food) {
        orderList.add(food);
    }

    public ArrayList<Food> getOrderList() {
        return new ArrayList<>(orderList);
    }

    public void showOrderItems() {
        for (Food food : orderList) {
            System.out.print(food.getName() + " : ");
            System.out.println(food.getCost());
        }
    }

    public List<List<String>> getOrderItems () {
        List<List<String>> orderItems = new ArrayList<>();
        for (Food food : orderList) {
            List<String> items = food.getName();
            orderItems.add(items);
        }
        return orderItems;
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Food food : orderList) {
            totalCost += food.getCost();
        }
        return totalCost;
    }

}
