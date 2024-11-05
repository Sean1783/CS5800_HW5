package org.restaurant;

public class CustomerLoyalty {

    private int loyaltyStatus = 0;
    CustomerLoyalty(int loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }
    public double applyDiscount(Order order) {
        double costBeforeDiscount = order.getTotalCost();
        return costBeforeDiscount - costBeforeDiscount * (loyaltyStatus / 100.0);
    }
}
