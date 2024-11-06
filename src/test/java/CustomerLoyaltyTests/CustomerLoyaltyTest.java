package CustomerLoyaltyTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.restaurant.CustomerLoyalty;
import org.restaurant.Order;

import static org.mockito.Mockito.*;


public class CustomerLoyaltyTest {

    @Test
    public void testValidCustomerLoyaltyValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CustomerLoyalty(-10);});
        assertThrows(IllegalArgumentException.class, () -> {
            new CustomerLoyalty(150);
        });
    }

    @Test
    public void testNullOrder() {
        CustomerLoyalty cl = new CustomerLoyalty(10);
        assertThrows(NullPointerException.class, () -> {cl.applyDiscount(null);});
    }

    @Test
    public void testApplyDiscount() {
        Order mockOrder = mock(Order.class);
        when(mockOrder.getTotalCost()).thenReturn(100.0);
        CustomerLoyalty loyalty = new CustomerLoyalty(10);
        double discountedPrice = loyalty.applyDiscount(mockOrder);
        assertEquals(90.00, discountedPrice, 0.01);
    }

}
