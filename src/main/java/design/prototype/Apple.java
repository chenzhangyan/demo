package design.prototype;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public class Apple extends Fruit {
    public void eat() {
        System.out.println("eat-apple");
    }

    public Shape getShape() {
        return new Circle();
    }
}
