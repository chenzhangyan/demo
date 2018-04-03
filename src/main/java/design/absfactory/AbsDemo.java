package design.absfactory;

/**
 * @author chenzhangyan  on 2018/4/2.
 */
public class AbsDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor("RED");
        color.display();
    }
}
