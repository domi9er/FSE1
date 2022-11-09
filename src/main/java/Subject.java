import java.util.ArrayList;
import java.util.List;

public class Subject {

    private int state;
    private List<AObserver> observers = new ArrayList<>();

    public void addObserver(AObserver observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for (AObserver observer : observers) {
            observer.update(state);
        }
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return this.state;
    }

}
