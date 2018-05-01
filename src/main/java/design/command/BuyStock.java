package design.command;

/**
 * Created by chenzhangyan on 2018/5/1.
 */
public class BuyStock implements Order {
    private Stock buyStock;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BuyStock(Stock buyStock) {
        this.buyStock = buyStock;
    }

    public void execute() {
        buyStock.buy(quantity);
    }
}
