package ucu.edu.ua.apps.lab8.flower;

import ucu.edu.ua.apps.lab8.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;
    private Payment payment;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public double getFinalPrice() {
        double totalPrice = items.stream().mapToDouble(Item::getPrice).sum();
        return payment.pay(totalPrice);
    }
}
