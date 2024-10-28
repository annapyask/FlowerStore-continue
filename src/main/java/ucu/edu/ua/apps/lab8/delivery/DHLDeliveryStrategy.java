package ucu.edu.ua.apps.lab8.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver() {
        return "Delivered by DHL";
    }
}