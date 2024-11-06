package BaseFoodTests;

import org.junit.jupiter.api.Test;
import org.restaurant.foods.basefood.Burger;
import org.restaurant.foods.basefood.Fries;
import org.restaurant.foods.basefood.HotDog;
import org.restaurant.foods.food.Food;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseFoodTest {

    @Test
    public void BurgerCostTest() {
        Food burger = new Burger();
        assertEquals(8.00, burger.getCost());
    }

    @Test
    public void BurgerNameTest() {
        Food burger = new Burger();
        assertEquals("Burger", burger.getName().get(0));
    }

    @Test
    public void FriesCostTest() {
        Food fries = new Fries();
        assertEquals(4.00, fries.getCost());
    }

    @Test
    public void FriesNameTest() {
        Food fries = new Fries();
        assertEquals("Fries", fries.getName().get(0));
    }

    @Test
    public void HotDogCostTest() {
        Food hotDog = new HotDog();
        assertEquals(7.00, hotDog.getCost());
    }

    @Test
    public void HotDogNameTest() {
        Food hotDog = new HotDog();
        assertEquals("Hot dog", hotDog.getName().get(0));
    }


}
