package specification;

import domain.customer.Customer;

public class LoyaltyDiscountSpecification implements Specification<Customer> {
    private final int minScore;

    public LoyaltyDiscountSpecification(int minScore) {
        this.minScore = minScore;
    }

    @Override
    public boolean isSatisfiedBy(Customer customer) {
        return customer.getLoyaltyScore() >= minScore;
    }
}