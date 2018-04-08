package design.decorator;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class TeamLeaderDecorator extends JobDecorator {
    public TeamLeaderDecorator(Job decoratedJob) {
        super(decoratedJob);
    }

    @Override
    public void work() {
        super.work();
        otherWork();
    }

    private void otherWork() {
        System.out.println("团队负责人还有别的活要做");
    }
}
