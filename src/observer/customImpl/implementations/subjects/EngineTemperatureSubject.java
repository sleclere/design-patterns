package observer.customImpl.implementations.subjects;

import observer.customImpl.interfaces.Observer;
import observer.customImpl.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EngineTemperatureSubject implements Subject {

    List<Observer> observers = new ArrayList<Observer>();
    int engineTemperature = 0;
    final int TEMPERATURE_THRESHOLD = 200;


    @Override
    public void registerObserver(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(engineTemperature);
        }
    }

    public void updateEngineTemperature(int engineTemperature){
        this.engineTemperature = engineTemperature;

        // actually, it would be better to always notify, and delegate the decision on how to behave to the observers
        if(engineTemperature > TEMPERATURE_THRESHOLD){
            notifyObservers();
        }
    }
}
