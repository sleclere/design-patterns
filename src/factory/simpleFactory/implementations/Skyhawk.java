package factory.simpleFactory.implementations;

import factory.simpleFactory.interfaces.Airplane;

public class Skyhawk extends Airplane {

    @Override
    public void fly() {
        System.out.println("Cessna flying slow and boring...");
    }
}
