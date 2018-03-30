package design.factory;

/**
 * @author chenzhangyan  on 2018/3/30.
 */
public class ShapeFactory {

    private Shape getShape(String shape) {
        if ("CIRCLE".equals(shape)) {
            return new Circle();
        } else if ("SQUARE".equals(shape)) {
            return new Square();
        }
        return null;
    }
}
