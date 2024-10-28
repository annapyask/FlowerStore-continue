package ucu.edu.ua.apps.lab8.flower;

public class Item {
    private FlowerBucket flowerBucket;

    public Item(FlowerBucket flowerBucket) {
        this.flowerBucket = flowerBucket;
    }

    public double getPrice() {
        return flowerBucket.getPrice();
    }
}
