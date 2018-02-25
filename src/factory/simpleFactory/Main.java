package factory.simpleFactory;

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
        FlightSchool flightSchool = new FlightSchool(new SimpleAirplaneFactory());
        flightSchool.performDemoFlight();
        flightSchool.performThrillingDemoFlight();
        flightSchool.performEconomicalDemoFlight();
    }
}
