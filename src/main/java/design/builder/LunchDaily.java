package design.builder;

/**
 * @author chenzhangyan  on 2018/4/3.
 */
public class LunchDaily {
    private LunchDaily() {
    }

    private static final class LunchHolder {
        private static Meal meal = new Meal();

        static {
            meal.addItem(new ChickenBurger());
            meal.addItem(new Coffee());
        }
    }

    public static Meal lunch() {
        return LunchHolder.meal;
    }
}
