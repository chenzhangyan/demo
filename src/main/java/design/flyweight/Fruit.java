package design.flyweight;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class Fruit implements Food {
    private String name;
    private String shape;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void eat() {
        System.out.println("name:" + name + ",shape:" + shape);
    }
}
