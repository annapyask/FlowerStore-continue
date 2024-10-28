package ucu.edu.ua.apps.lab8.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        return flowerPacks.stream().mapToDouble(pack -> pack.getFlower().getPrice() * pack.getCount()).sum();
    }
}
