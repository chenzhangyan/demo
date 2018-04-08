package design.flyweight;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class Demo {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 1000) {
            Fruit fruit = (Fruit) FoodFactory.getFruit("fruit" + i%10);
            fruit.eat();
        }
    }
}
