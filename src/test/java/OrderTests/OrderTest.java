package OrderTests;

import org.restaurant.Order;
import org.restaurant.foods.basefood.Burger;
import org.restaurant.foods.basefood.Fries;
import org.restaurant.foods.food.Food;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;

public class OrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order();
    }

    @Test
    public void testAddItem() {
        Food mockBurger = mock(Burger.class);
        when(mockBurger.getName()).thenReturn(Collections.singletonList("Burger"));
        Food mockFries = mock(Fries.class);
        when(mockFries.getName()).thenReturn(Collections.singletonList("Fries"));

        order = new Order();
        order.addItem(mockBurger);
        order.addItem(mockFries);

        assertEquals(mockBurger, order.getOrderList().get(0));
        assertEquals(mockFries, order.getOrderList().get(1));
        assertEquals(2, order.getOrderList().size());
    }

    @Test
    public void testGetTotalCost() {
        Food mockBurger = mock(Burger.class);
        when(mockBurger.getCost()).thenReturn(8.00);
        Food mockFries = mock(Fries.class);
        when(mockFries.getCost()).thenReturn(4.00);
        order.addItem(mockBurger);
        order.addItem(mockFries);
        assertEquals(12.00, order.getTotalCost());
    }



}
