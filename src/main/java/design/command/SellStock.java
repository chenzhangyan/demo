package design.command;

/**
 * Created by chenzhangyan on 2018/5/1.
 */
public class SellStock implements Order {
    private Stock sellStock;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SellStock(Stock sellStock) {
        this.sellStock = sellStock;
    }

    public void execute() {
        sellStock.sell(quantity);
    }
}
