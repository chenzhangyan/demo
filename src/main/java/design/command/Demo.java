package design.command;

/**
 * Created by chenzhangyan on 2018/5/1.
 */
public class Demo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.setStockCode("0000001.SZ");
        stock.setStockName("平安银行");

        StockBroker stockBroker = new StockBroker();

        BuyStock buyStock = new BuyStock(stock);
        buyStock.setQuantity(100);
        SellStock sellStock = new SellStock(stock);
        sellStock.setQuantity(50);
        stockBroker.takeOrder(buyStock);
        stockBroker.takeOrder(sellStock);
        stockBroker.placeOrders();
    }
}
