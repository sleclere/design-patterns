package factory.factoryMethod.implementations;

import factory.factoryMethod.interfaces.Airplane;
import factory.factoryMethod.interfaces.FlightSchool;


public class RadFlightSchool extends FlightSchool {

    @Override
    public Airplane purchaseAirplane() {
        return new Revo();
    }
}