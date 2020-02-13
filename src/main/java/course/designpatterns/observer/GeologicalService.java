package course.designpatterns.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Sujeto concreto
public class GeologicalService implements Subject {

    private List<Observer> observers;

    public GeologicalService() {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Earthquake earthquake) {
        System.out.println("Antes de notifica a los observadores");

        for(Observer observer: observers) {
            observer.update(earthquake);
        }

        System.out.println("Los observadores han sido notificados");
    }

    public void tremble() {
        Earthquake earthquake = new Earthquake(30.3207200, 35.4839200, 6, LocalDateTime.now());
        notifyObservers(earthquake);
    }
}
