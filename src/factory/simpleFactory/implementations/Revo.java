package factory.simpleFactory.implementations;

import factory.simpleFactory.interfaces.Airplane;

public class Revo extends Airplane {
    @Override
    public void fly() {
        System.out.println("Revo flying low and slow!");
    }
}
