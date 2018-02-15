package observer.implementations;

import observer.interfaces.Observer;

public class AudioPanelObserver implements Observer {
    @Override
    public void update() {
        System.out.println("AudioPanelObserver: Sound Audible Alarm all Headsets!");
    }
}
