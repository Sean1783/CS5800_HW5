package FoodToppingTests;

import org.junit.jupiter.api.Test;
import org.restaurant.foods.basefood.Burger;
import org.restaurant.foods.basefood.HotDog;
import org.restaurant.foods.food.Food;
import org.restaurant.foods.foodtopping.Cheese;
import org.restaurant.foods.foodtopping.Chili;
import org.restaurant.foods.foodtopping.Onion;
import org.restaurant.foods.foodtopping.Tomato;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FoodToppingTest {

    @Test
    public void testCheeseCost() {
        Food cheeseburger = new Cheese(new Burger());
        assertEquals(11.00, cheeseburger.getCost());
    }

    @Test
    public void testCheeseName() {
        Food cheeseburger = new Cheese(new Burger());
        assertTrue(cheeseburger.getName().contains("Cheese"));
        assertTrue(cheeseburger.getName().contains("Burger"));
    }

    @Test
    public void testChiliCost() {
        Food chilidog = new Chili(new HotDog());
        assertEquals(10.00, chilidog.getCost());
    }

    @Test
    public void testChiliName() {
        Food chilidog = new Chili(new HotDog());
        assertTrue(chilidog.getName().contains("Chili"));
        assertTrue(chilidog.getName().contains("Hot dog"));
    }

    @Test
    public void testOnionCost() {
        Food onionBurger = new Onion(new Burger());
        assertEquals(9.00, onionBurger.getCost());
    }

    @Test
    public void testOnionName() {
        Food onionBurger = new Onion(new Burger());
        assertTrue(onionBurger.getName().contains("Onion"));
        assertTrue(onionBurger.getName().contains("Burger"));
    }

    @Test
    public void testTomatoCost() {
        Food tomatoBurger = new Tomato(new Burger());
        assertEquals(10.00, tomatoBurger.getCost());
    }

    @Test
    public void testTomatoName() {
        Food tomatoBurger = new Tomato(new Burger());
        assertTrue(tomatoBurger.getName().contains("Tomato"));
        assertTrue(tomatoBurger.getName().contains("Burger"));
    }
}
