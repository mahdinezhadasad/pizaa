package domain.customer;

public class Customer {
    private final String name;
    private final int loyaltyScore;

    public Customer(String name, int loyaltyScore) {
        this.name = name;
        this.loyaltyScore = loyaltyScore;
    }

    public int getLoyaltyScore() {
        return loyaltyScore;
    }
}