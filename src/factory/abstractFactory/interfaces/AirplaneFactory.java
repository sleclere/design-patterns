package factory.abstractFactory.interfaces;

import factory.abstractFactory.interfaces.components.Empennage;
import factory.abstractFactory.interfaces.components.Fuselage;
import factory.abstractFactory.interfaces.components.Wing;


public interface AirplaneFactory {

    public Fuselage produceFuselage();
    public Empennage produceEmpennage();
    public Wing produceWing();

}
