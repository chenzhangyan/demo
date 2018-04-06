package design.prototype;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public class Pear extends Fruit {
    public void eat() {
        System.out.println("eat-pear");
    }

    @Override
    public Shape getShape() {
        return new Elipse();
    }
}
