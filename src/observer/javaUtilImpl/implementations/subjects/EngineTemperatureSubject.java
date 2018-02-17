package observer.javaUtilImpl.implementations.subjects;

import observer.customImpl.interfaces.Observer;

import java.util.Observable;

import java.util.ArrayList;
import java.util.List;

public class EngineTemperatureSubject extends Observable {

    List<Observer> observers = new ArrayList<Observer>();
    private int engineTemperature = 0;
    final int TEMPERATURE_THRESHOLD = 200;


    public void updateEngineTemperature(int engineTemperature){
        this.engineTemperature = engineTemperature;

        // actually, it would be better to always notify, and delegate the decision on how to behave to the observers
        if(engineTemperature > TEMPERATURE_THRESHOLD){
            setChanged();  // only
            // notice not passing state, observers must PULL state from observable instance
            notifyObservers();  // inherited from java.util.Observable
        }
    }

    public int getEngineTemperature() {
        return engineTemperature;
    }
}
