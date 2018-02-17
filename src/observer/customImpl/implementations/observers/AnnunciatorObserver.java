package observer.customImpl.implementations.observers;

import observer.customImpl.interfaces.Observer;
import observer.customImpl.interfaces.Subject;

public class AnnunciatorObserver implements Observer {

    Subject subject;

    public AnnunciatorObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int engineTemperature) {
        System.out.println("AnnunciatorObserver: Illuminate General Warning Annunciator!" + " [" + engineTemperature + "]");
    }
}
