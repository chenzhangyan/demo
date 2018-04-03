package design.absfactory;

/**
 * @author chenzhangyan  on 2018/3/30.
 */
public class ShapeFactory extends AbstractFactory{

    public Shape getShape(String shape) {
        if ("CIRCLE".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("SQUARE".equalsIgnoreCase(shape)) {
            return new Square();
        }
        return null;
    }

    public Color getColor(String color) {
        return null;
    }
}
