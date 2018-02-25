package factory.factoryMethod.implementations;


import factory.factoryMethod.interfaces.Airplane;

public class Skyhawk extends Airplane {

    @Override
    public void fly() {
        System.out.println("Cessna flying slow and boring...");
    }
}
