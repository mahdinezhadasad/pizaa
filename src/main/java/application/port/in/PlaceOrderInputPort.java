package application.port.in;

import domain.customer.Customer;
import domain.pizza.IPizza;

public interface PlaceOrderInputPort {
    void placeOrder(IPizza pizza, Customer customer);
}