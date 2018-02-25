package factory.factoryMethod;


import factory.factoryMethod.implementations.RadFlightSchool;
import factory.factoryMethod.implementations.ThriftyFlightSchool;
import factory.factoryMethod.implementations.TraditionalFlightSchool;
import factory.factoryMethod.interfaces.FlightSchool;

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
        FlightSchool school = new TraditionalFlightSchool();
        school.performDemoFlight();

        school = new ThriftyFlightSchool();
        school.performDemoFlight();

        school = new RadFlightSchool();
        school.performDemoFlight();
    }
}
