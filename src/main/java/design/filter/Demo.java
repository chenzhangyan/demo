package design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenzhangyan on 2018/4/7.
 */
public class Demo {
    public static void main(String[] args) {
        People mike = new People("正常", 30, 1, 1300000);
        People tom = new People("单亲", 28, 1, 1200000);
        People green = new People("正常", 26, 1, 1100000);
        People bob = new People("正常", 28, 1, 600000);
        People lily = new People("单亲", 27, 0, 300000);
        People sophia = new People("正常", 31, 0, 700000);
        List<People> list = new ArrayList<People>();
        list.add(mike);
        list.add(tom);
        list.add(bob);
        list.add(green);
        list.add(lily);
        list.add(sophia);
        AgeFilter ageFilter = new AgeFilter();
        FamilyFilter familyFilter = new FamilyFilter();
        FemaleFilter femaleFilter = new FemaleFilter();
        MaleFilter maleFilter = new MaleFilter();
        WealthFilter wealthFilter = new WealthFilter();
        ageFilter.doFilter(list);
        System.out.println(list);
        familyFilter.doFilter(list);
        System.out.println(list);
        wealthFilter.doFilter(list);
        System.out.println(list);
        maleFilter.doFilter(list);
        System.out.println(list);
    }
}
