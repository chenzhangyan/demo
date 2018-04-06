package design.prototype;

import java.util.HashMap;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public abstract class Fruit implements Item,Cloneable {
    public abstract Shape getShape();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone(){
        Object fruit = null;
        try {
            fruit = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return fruit;
    }
}
