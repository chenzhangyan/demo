package design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenzhangyan on 2018/5/1.
 */
public class StockBroker {
    private List<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
