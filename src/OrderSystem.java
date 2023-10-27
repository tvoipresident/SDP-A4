import java.util.ArrayList;
import java.util.List;

public class OrderSystem {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void placeOrder(String order) {
        System.out.println("New order placed: " + order);
        notifyObservers(order);
    }

    private void notifyObservers(String order) {
        for (Observer observer : observers) {
            observer.update(order);
        }
    }
}
