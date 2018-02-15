package observer;


import observer.implementations.AnnunciatorObserver;
import observer.implementations.AudioPanelObserver;
import observer.implementations.EngineTemperatureSubject;
import observer.implementations.PrimaryFlightDisplayObserver;

public class Main {

    public static void main(String[] args) {
        printDescription();
        demonstratePattern();
    }

    private static void printDescription(){
        System.out.println("*****************************************************************");
        System.out.println("Design Pattern: OBSERVER");
        System.out.println("Pattern Type: BEHAVIORAL");
        System.out.println("The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically");
        System.out.println("*****************************************************************");
    }

    private static void demonstratePattern(){
        // new up subject
        EngineTemperatureSubject subject = new EngineTemperatureSubject();
        // new up observers
        PrimaryFlightDisplayObserver pfdObserver = new PrimaryFlightDisplayObserver();
        AnnunciatorObserver annunciatorObserver = new AnnunciatorObserver();
        AudioPanelObserver audioPanelObserver = new AudioPanelObserver();

        // register observers
        subject.registerObserver(pfdObserver);
        subject.registerObserver(annunciatorObserver);
        subject.registerObserver(audioPanelObserver);

        subject.notifyObservers();

        subject.removeObserver(annunciatorObserver);

        subject.notifyObservers();
    }
}
