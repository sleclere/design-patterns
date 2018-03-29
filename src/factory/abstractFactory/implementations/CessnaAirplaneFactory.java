package factory.abstractFactory.implementations;

import factory.abstractFactory.implementations.components.CessnaEmpennage;
import factory.abstractFactory.implementations.components.CessnaFuselage;
import factory.abstractFactory.implementations.components.CessnaWing;
import factory.abstractFactory.interfaces.AirplaneFactory;
import factory.abstractFactory.interfaces.components.Empennage;
import factory.abstractFactory.interfaces.components.Fuselage;
import factory.abstractFactory.interfaces.components.Wing;

public class CessnaAirplaneFactory implements AirplaneFactory {
    @Override
    public Fuselage produceFuselage() {
        return new CessnaFuselage();
    }

    @Override
    public Empennage produceEmpennage() {
        return new CessnaEmpennage();
    }

    @Override
    public Wing produceWing() {
        return new CessnaWing();
    }
}
