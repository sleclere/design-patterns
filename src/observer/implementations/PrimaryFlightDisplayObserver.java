package observer.implementations;

import observer.interfaces.Observer;

public class PrimaryFlightDisplayObserver implements Observer {
    @Override
    public void update() {
        System.out.println("PrimaryFlightDisplayObserver: Indicate Engine Temperature Warning!");
    }
}
