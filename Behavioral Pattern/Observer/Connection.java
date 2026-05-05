package Observer;

import java.util.ArrayList;
import java.util.List;

public class Connection implements Subject {
    private String userName;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public Connection(String userName) {
        this.userName = userName;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(userName, status);
        }
    }
}
