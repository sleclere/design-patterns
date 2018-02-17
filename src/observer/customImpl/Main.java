package observer.customImpl;


import observer.customImpl.implementations.observers.AnnunciatorObserver;
import observer.customImpl.implementations.observers.AudioPanelObserver;
import observer.customImpl.implementations.subjects.EngineTemperatureSubject;
import observer.customImpl.implementations.observers.PrimaryFlightDisplayObserver;

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
        PrimaryFlightDisplayObserver pfdObserver = new PrimaryFlightDisplayObserver(subject);
        AnnunciatorObserver annunciatorObserver = new AnnunciatorObserver(subject);
        AudioPanelObserver audioPanelObserver = new AudioPanelObserver(subject);


        subject.updateEngineTemperature(10);
        subject.updateEngineTemperature(77);
        subject.updateEngineTemperature(180);
        subject.updateEngineTemperature(220);
        subject.updateEngineTemperature(180);

        subject.removeObserver(annunciatorObserver);

    }
}
