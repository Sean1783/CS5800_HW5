import BaseFoodTests.BaseFoodTest;
import CustomerLoyaltyTests.CustomerLoyaltyTest;
import FoodDecoratorTest.FoodDecoratorTest;

import FoodToppingTests.FoodToppingTest;
import OrderTests.OrderTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CompleteRestaurantUnitTest.class,
        FoodDecoratorTest.class,
        BaseFoodTest.class,
        FoodToppingTest.class,
        CustomerLoyaltyTest.class,
        OrderTest.class
        }) public class CompleteRestaurantUnitTest {}



