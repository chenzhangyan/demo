package design.filter;

import java.util.Iterator;
import java.util.List;

/**
 * Created by chenzhangyan on 2018/4/7.
 */
public class MaleFilter implements Filter {
    public void doFilter(List<People> list) {
        Iterator<People> iterator = list.iterator();
        while (iterator.hasNext()) {
            People people = iterator.next();
            if (people.getSex() != 1) {
                iterator.remove();
            }
        }
    }
}
