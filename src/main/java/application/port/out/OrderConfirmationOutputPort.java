package application.port.out;

public interface OrderConfirmationOutputPort {
    void confirmOrder(String confirmationMessage);
    void rejectOrder(String reason);
}
