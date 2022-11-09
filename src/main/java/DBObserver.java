public class DBObserver extends AObserver {
    public DBObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update(int state) {
        System.out.println("save " + state + " to db...");

        System.out.println(subject.getState());
    }
}
