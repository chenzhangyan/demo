package design.adapter;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public class AutoMealAdapter implements AutoMeal {
    MealAdapter mealAdapter;
    public void eat(String name) {
        if ("no-idea".equalsIgnoreCase(name)) {
            System.out.println("不吃了");
        } else if ("breakfast".equalsIgnoreCase(name) || "lunch".equalsIgnoreCase(name) || "dinner".equalsIgnoreCase(name)) {
            mealAdapter = new MealAdapter(name);
            mealAdapter.eat(name);
        } else {
            System.out.println("吃啥呢");
        }
    }
}
