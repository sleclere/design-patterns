package factory.abstractFactory;


import factory.abstractFactory.implementations.Cessna;
import factory.abstractFactory.implementations.CessnaAirplaneFactory;
import factory.abstractFactory.interfaces.AirplaneFactory;
import factory.abstractFactory.interfaces.components.Airplane;
import factory.abstractFactory.interfaces.components.Empennage;
import factory.abstractFactory.interfaces.components.Fuselage;
import factory.abstractFactory.interfaces.components.Wing;

public class Main {

    public static void main(String[] args) {
        printDescription();
        demonstratePattern();
    }

    private static void printDescription(){
        System.out.println("*****************************************************************");
        System.out.println("Design Pattern: FACTORY (SIMPLE)");
        System.out.println("Pattern Type: BEHAVIORAL");
        System.out.println("Technically not an official pattern, but widely used");

        System.out.println("Encapsulate object creation into a simple object.  Others may compose this object and delegate to it for newing up objects");
        System.out.println("*****************************************************************");
    }

    private static void demonstratePattern(){

        Airplane cessna = assembleAirplane(new CessnaAirplaneFactory());
    }

    private static Airplane assembleAirplane(AirplaneFactory factory){
        Wing wing = factory.produceWing();
        Empennage empennage = factory.produceEmpennage();
        Fuselage fuselage = factory.produceFuselage();

        //TODO PUH
        return null;
    }
}
