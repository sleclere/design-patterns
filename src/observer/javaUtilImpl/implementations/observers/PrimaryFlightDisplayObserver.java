package observer.javaUtilImpl.implementations.observers;

import observer.javaUtilImpl.implementations.subjects.EngineTemperatureSubject;

import java.util.Observer;
import java.util.Observable;

public class PrimaryFlightDisplayObserver implements Observer {

    Observable subject;

    public PrimaryFlightDisplayObserver(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("PrimaryFlightDisplayObserver: Indicate Engine Temperature Warning!" + " [" + ((EngineTemperatureSubject)subject).getEngineTemperature() + "]");
    }
}

