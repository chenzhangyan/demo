package design.command;

/**
 * Created by chenzhangyan on 2018/4/29.
 */
public class Stock {
    private String stockCode;
    private String stockName;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }


    public void buy(int quantity) {
        System.out.println("buy-stock:[" + stockCode + " " + stockName + "]" + quantity);
    }

    public void sell(int quantity) {
        System.out.println("sell-stock:[" + stockCode + " " + stockName + "]" + quantity);
    }
}
