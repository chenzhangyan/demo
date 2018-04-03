package design.absfactory;

/**
 * @author chenzhangyan  on 2018/4/2.
 */
public class ColorFactory extends AbstractFactory {
    public Shape getShape(String shape) {
        return null;
    }

    public Color getColor(String color) {
        if ("RED".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("BLUE".equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }
}
