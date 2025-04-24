package policy;

import domain.customer.Customer;

public class FixedDiscountPolicy implements DiscountPolicy {
    private final double discount;

    public FixedDiscountPolicy(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean isApplicable(Customer customer) {
        return customer.getLoyaltyScore() > 100;
    }

    @Override
    public double applyDiscount(double price) {
        return price - discount;
    }
}