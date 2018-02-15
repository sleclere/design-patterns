package observer.implementations;

import observer.interfaces.Observer;

public class AnnunciatorObserver implements Observer {
    @Override
    public void update() {
        System.out.println("AnnunciatorObserver: Illuminate General Warning Annunciator!");
    }
}
