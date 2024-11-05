package FoodDecoratorTest;

import org.restaurant.foods.FoodDecorator;
import org.restaurant.foods.food.Food;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FoodDecoratorTest {

    FoodDecorator foodDecorator;
    Food foodItem;

    private static class MockFood implements Food {
        private final double cost;
        private final List<String> names;

        public MockFood(double cost, List<String> names) {
            this.cost = cost;
            this.names = names;
        }
        @Override
        public double getCost() {
            return this.cost;
        }

        @Override
        public List<String> getName() {
            return this.names;
        }
    }

    @BeforeEach
    public void setUp() {
        foodItem = new MockFood(10.99, List.of("Mocked food"));
        foodDecorator = new FoodDecorator(foodItem);
    }

    @Test
    public void FoodDecoratorInitTest() {
        foodDecorator = new FoodDecorator(foodItem);
        assertNotNull(foodDecorator);
    }

    @Test
    public void FoodDecoratorGetNameTest() {
        List<String> name = foodDecorator.getName();
        assertTrue(name.contains("Mocked food"));
    }

    @Test
    public void FoodDecoratorGetNameSizeTest() {
        List<String> name = foodDecorator.getName();
        assertEquals(1, name.size());
    }

    @Test
    public void FoodDecoratorGetCostTest() {
        assertEquals(10.99, foodDecorator.getCost());
    }

}