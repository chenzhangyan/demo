package design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzhangyan  on 2018/4/3.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("name:" + item.name() + ",packing:" + item.packing().pack() + ",price:" + item.price());
        }
    }
}
