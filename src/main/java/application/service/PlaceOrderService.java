package application.service;


import application.port.in.PlaceOrderInputPort;
import application.port.out.OrderConfirmationOutputPort;
import domain.customer.Customer;
import domain.pizza.IPizza;
import specification.LoyaltyDiscountSpecification;
import specification.MaxCaloriesSpecification;
import specification.Specification;

public class PlaceOrderService implements PlaceOrderInputPort {

    private final OrderConfirmationOutputPort outputPort;

    public PlaceOrderService(OrderConfirmationOutputPort outputPort) {
        this.outputPort = outputPort;
    }

    @Override
    public void placeOrder(IPizza pizza, Customer customer) {
        Specification discountEligible = new LoyaltyDiscountSpecification(10);
        Specification calorieLimit = new MaxCaloriesSpecification(250);

        if (!calorieLimit.isSatisfiedBy(pizza)) {
            outputPort.rejectOrder("Calories exceeded!");
            return;
        }

        if (discountEligible.isSatisfiedBy(customer)) {
            outputPort.confirmOrder("Order placed with loyalty discount!");
        } else {
            outputPort.confirmOrder("Order placed without discount.");
        }
    }
}
