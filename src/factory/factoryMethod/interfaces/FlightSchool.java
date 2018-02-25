package factory.factoryMethod.interfaces;

public abstract class FlightSchool {

    private Airplane airplane;

    // here the super type is delegating to concrete FlightSchool for airplane construction/purchasing
    public void performDemoFlight(){
        airplane = purchaseAirplane();
        airplane.fly();
    }

    // delegate airplane acquisition to subclasses
    public abstract Airplane purchaseAirplane();
}
