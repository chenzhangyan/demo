package design.decorator;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class JobDecorator implements Job {
    private Job decoratedJob;

    public JobDecorator(Job decoratedJob) {
        this.decoratedJob = decoratedJob;
    }

    public void work() {
        decoratedJob.work();
    }
}
