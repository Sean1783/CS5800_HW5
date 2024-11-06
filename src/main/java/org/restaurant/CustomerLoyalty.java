package org.restaurant;

public class CustomerLoyalty {

    private int loyaltyStatus = 0;
    public CustomerLoyalty(int loyaltyStatus) {
        if (loyaltyStatus < 0 || loyaltyStatus > 100) {
            throw new IllegalArgumentException("Loyalty status must be between 0 and 100.");
        }
        this.loyaltyStatus = loyaltyStatus;
    }

    public double applyDiscount(Order order) {
        if (order == null) {
            throw new NullPointerException("Order cannot be null.");
        }
        double costBeforeDiscount = order.getTotalCost();
        return costBeforeDiscount - costBeforeDiscount * (loyaltyStatus / 100.0);
    }
}
