package observer.customImpl.implementations.observers;

import observer.customImpl.interfaces.Observer;
import observer.customImpl.interfaces.Subject;

public class PrimaryFlightDisplayObserver implements Observer {

    Subject subject;

    public PrimaryFlightDisplayObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int engineTemperature) {
        System.out.println("PrimaryFlightDisplayObserver: Indicate Engine Temperature Warning!" + " [" + engineTemperature + "]");
    }
}
