package ucu.edu.ua.apps.lab8.delivery;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver() {
        return "Delivered by Post";
    }
}