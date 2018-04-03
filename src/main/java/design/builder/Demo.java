package design.builder;

/**
 * @author chenzhangyan  on 2018/4/3.
 */
public class Demo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareMeal();
        meal.showItems();
        System.out.println("cost:" + meal.getCost());
        Meal lunch = mealBuilder.lunchDaily();
        lunch.showItems();
        System.out.println("cost:" + lunch.getCost());
    }
}
