package observer.javaUtilImpl.implementations.observers;


import observer.javaUtilImpl.implementations.subjects.EngineTemperatureSubject;

import java.util.Observer;
import java.util.Observable;

public class AudioPanelObserver implements Observer {

    Observable subject;

    public AudioPanelObserver(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("AudioPanelObserver: Sound Audible Alarm all Headsets!" + " [" + ((EngineTemperatureSubject)subject).getEngineTemperature() + "]");
    }
}
