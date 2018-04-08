package design.decorator;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class Demo {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.work();
        TeamLeaderDecorator leader = new TeamLeaderDecorator(new Coder());
        leader.work();
    }
}
