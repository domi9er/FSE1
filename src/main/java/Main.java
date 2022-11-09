public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        LogObserver logObserver = new LogObserver(subject);
        DBObserver dbObserver = new DBObserver(subject);
        AObserver rssObserver = new RSSObserver(subject);

        subject.notifyAllObservers();

        subject.addObserver(logObserver);
        subject.notifyAllObservers();
        subject.setState(5);

        subject.addObserver(dbObserver);
        subject.notifyAllObservers();

        subject.addObserver(rssObserver);
        System.out.println("------------------");

        subject.notifyAllObservers();

    }
}
