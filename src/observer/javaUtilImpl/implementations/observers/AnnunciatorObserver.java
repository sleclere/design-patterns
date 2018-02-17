package observer.javaUtilImpl.implementations.observers;

import observer.javaUtilImpl.implementations.subjects.EngineTemperatureSubject;

import java.util.Observer;
import java.util.Observable;

public class AnnunciatorObserver implements Observer {

    Observable subject;

    public AnnunciatorObserver(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("AnnunciatorObserver: Illuminate General Warning Annunciator!" + " [" + ((EngineTemperatureSubject)subject).getEngineTemperature() + "]");
    }
}
