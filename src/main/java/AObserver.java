public abstract class AObserver {

    protected Subject subject;

    public AObserver(Subject subject) {
        this.subject = subject;
    }

    public abstract void update(int state);

}
