package design.adapter;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public class Demo {
    public static void main(String[] args) {
        AutoMealAdapter autoMealAdapter = new AutoMealAdapter();
        autoMealAdapter.eat("breakfast");
        autoMealAdapter.eat("lunch");
        autoMealAdapter.eat("dinner");
        autoMealAdapter.eat("no-idea");
        autoMealAdapter.eat("???");
    }
}
