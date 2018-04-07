package design.filter;

/**
 * Created by chenzhangyan on 2018/4/7.
 */
public class People {
    private String family;
    private int age;
    private int sex;
    private double wealth;

    public People() {
    }

    public People(String family, int age, int sex, double wealth) {
        this.family = family;
        this.age = age;
        this.sex = sex;
        this.wealth = wealth;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public double getWealth() {
        return wealth;
    }

    public void setWealth(double wealth) {
        this.wealth = wealth;
    }

    @Override
    public String toString() {
        return "People{" +
                "family='" + family + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", wealth=" + wealth +
                '}';
    }
}
