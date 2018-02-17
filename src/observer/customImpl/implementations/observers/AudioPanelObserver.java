package observer.customImpl.implementations.observers;

import observer.customImpl.interfaces.Observer;
import observer.customImpl.interfaces.Subject;

public class AudioPanelObserver implements Observer {

    Subject subject;

    public AudioPanelObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int engineTemperature) {
        System.out.println("AudioPanelObserver: Sound Audible Alarm all Headsets!" + " [" + engineTemperature + "]");
    }
}
