package factory.simpleFactory;

import factory.simpleFactory.interfaces.Airplane;

public class FlightSchool {
    SimpleAirplaneFactory factory;

    // by passing at construction time a factory, FlightSchool avoids dependencies on concrete Airplanes
    public FlightSchool(SimpleAirplaneFactory factory) {
        this.factory = factory;
    }

    public void performDemoFlight(){
        Airplane demoPlane = factory.makeAirplane(Category.CERTIFIED);
        demoPlane.fly();
    }

    public void performThrillingDemoFlight(){
        Airplane demoPlane = factory.makeAirplane(Category.WEIGHT_SHIFT);
        demoPlane.fly();
    }

    public void performEconomicalDemoFlight(){
        Airplane demoPlane = factory.makeAirplane(Category.LIGHT_SPORT);
        demoPlane.fly();
    }
}
