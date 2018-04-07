package design.filter;

import java.util.List;

/**
 * Created by chenzhangyan on 2018/4/7.
 */
public interface Filter {
    void doFilter(List<People> list);
}
