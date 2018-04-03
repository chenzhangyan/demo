package design.builder;

/**
 * @author chenzhangyan  on 2018/4/3.
 */
public class MealBuilder {
    public Meal prepareMeal() {
        Meal meal = new Meal();
        meal.addItem(new Milk());
        meal.addItem(new Coffee());
        meal.addItem(new ChickenBurger());
        meal.addItem(new BeefBurger());
        return meal;
    }

    public Meal lunchDaily() {
        return LunchDaily.lunch();
    }
}
