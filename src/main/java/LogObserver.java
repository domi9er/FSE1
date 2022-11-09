public class LogObserver extends AObserver{
    public LogObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update(int state) {
        System.out.println("save " + state + " to log...");

        System.out.println(subject.getState());
    }
}
