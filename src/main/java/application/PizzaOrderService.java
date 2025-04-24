package application;

import domain.customer.Customer;
import domain.pizza.IPizza;
import domain.pizza.decorator.CheeseDecorator;
import domain.pizza.decorator.MushroomDecorator;
import factory.PizzaFactory;
import policy.DiscountPolicy;
import policy.PercentageDiscountPolicy;
import specification.MaxCaloriesSpecification;
import specification.Specification;

public class PizzaOrderService {
    public void placeOrder(IPizza pizza, Specification<IPizza> spec, Customer customer, DiscountPolicy discountPolicy) {
        System.out.println("Ordering: " + pizza.getDescription());
        System.out.println("Calories: " + pizza.getCalories());

        if (!spec.isSatisfiedBy(pizza)) {
            System.out.println("⚠ Order Rejected: Too many calories!");
            return;
        }

        double price = 12.99; // base price
        if (discountPolicy.isApplicable(customer)) {
            price = discountPolicy.applyDiscount(price);
            System.out.println("🎉 Discount applied!");
        }

        System.out.printf("✅ Order Accepted! Final Price: €%.2f\n", price);
    }

}