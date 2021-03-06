package design.factory;

/**
 * @author chenzhangyan  on 2018/3/30.
 */
public class Demo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("CIRCLE");
        Shape square = factory.getShape("SQUARE");
        circle.draw();
        square.draw();
    }
}
