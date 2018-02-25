package factory.factoryMethod.implementations;


import factory.factoryMethod.interfaces.Airplane;

public class Revo extends Airplane {
    @Override
    public void fly() {
        System.out.println("Revo flying low and slow!");
    }
}
