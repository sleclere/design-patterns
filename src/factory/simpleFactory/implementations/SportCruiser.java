package factory.simpleFactory.implementations;

import factory.simpleFactory.interfaces.Airplane;

public class SportCruiser extends Airplane {
    @Override
    public void fly() {
        System.out.println("Sportcruiser lookin fast, flying slow:)");
    }
}
