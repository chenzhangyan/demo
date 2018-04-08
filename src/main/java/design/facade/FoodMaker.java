package design.facade;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class FoodMaker {
    private Burger burger;
    private PotatoChips potatoChips;

    public FoodMaker() {
        this.burger = new Burger();
        this.potatoChips = new PotatoChips();
    }

    public void cookBurger() {
        burger.cook();
    }

    public void cookPotatoChips() {
        potatoChips.cook();
    }

}
