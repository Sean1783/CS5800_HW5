package org.restaurant;

import org.restaurant.foods.basefood.Burger;
import org.restaurant.foods.basefood.Fries;
import org.restaurant.foods.basefood.HotDog;
import org.restaurant.foods.food.Food;
import org.restaurant.foods.foodtopping.Cheese;
import org.restaurant.foods.foodtopping.Chili;
import org.restaurant.foods.foodtopping.Onion;
import org.restaurant.foods.foodtopping.Tomato;

public class Main {

    public static void main(final String[] args) {

        Food chiliFries = new Cheese(new Onion(new Chili(new Fries())));
        Food cheeseBurger = new Burger();
        cheeseBurger = new Cheese(new Onion(new Chili(cheeseBurger)));
        cheeseBurger = new Tomato(cheeseBurger);
        Food chilidog = new Onion(new Chili(new Cheese((new HotDog()))));

        Order orderOne = new Order();
        orderOne.addItem(cheeseBurger);
        orderOne.addItem(chiliFries);
        orderOne.showOrderItems();
        System.out.println("Subtotal : " + orderOne.getTotalCost());
        CustomerLoyalty customerOne = new CustomerLoyalty(10);
        System.out.println("Price after Loyalty discount : " + customerOne.applyDiscount(orderOne));

        Order orderTwo = new Order();
        chilidog = new Cheese(chilidog);
        orderTwo.addItem(chilidog);
        orderTwo.showOrderItems();
        System.out.println("Subtotal : " + orderTwo.getTotalCost());
        CustomerLoyalty customerTwo = new CustomerLoyalty(50);
        System.out.println("Price after Loyalty discount : " + customerTwo.applyDiscount(orderTwo));
    }
}
