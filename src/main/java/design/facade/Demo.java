package design.facade;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class Demo {
    public static void main(String[] args) {
        FoodMaker foodMaker = new FoodMaker();
        foodMaker.cookBurger();
        foodMaker.cookPotatoChips();
    }
}
