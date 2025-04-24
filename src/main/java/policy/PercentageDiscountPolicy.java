package policy;

import domain.customer.Customer;

public class PercentageDiscountPolicy implements DiscountPolicy {
    private final double percentage;

    public PercentageDiscountPolicy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean isApplicable(Customer customer) {
        return customer.getLoyaltyScore() > 200;
    }

    @Override
    public double applyDiscount(double price) {
        return price * (1 - percentage);
    }
}