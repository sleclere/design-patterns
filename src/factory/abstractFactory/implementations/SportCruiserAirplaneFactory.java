package factory.abstractFactory.implementations;

import factory.abstractFactory.implementations.components.SportCruiserEmpennage;
import factory.abstractFactory.implementations.components.SportCruiserFuselage;
import factory.abstractFactory.implementations.components.SportCruiserWing;
import factory.abstractFactory.interfaces.AirplaneFactory;
import factory.abstractFactory.interfaces.components.Empennage;
import factory.abstractFactory.interfaces.components.Fuselage;
import factory.abstractFactory.interfaces.components.Wing;

public class SportCruiserAirplaneFactory implements AirplaneFactory {
    @Override
    public Fuselage produceFuselage() {
        return new SportCruiserFuselage();
    }

    @Override
    public Empennage produceEmpennage() {
        return new SportCruiserEmpennage();
    }

    @Override
    public Wing produceWing() {
        return new SportCruiserWing();
    }
}
