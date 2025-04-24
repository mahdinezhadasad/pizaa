package policy;

import domain.customer.Customer;

public interface DiscountPolicy {
    boolean isApplicable(Customer customer);
    double applyDiscount(double price);
}