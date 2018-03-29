package templateMethod;


import templateMethod.implementations.PreparedCessnaPilot;
import templateMethod.implementations.PreparedSportCruiserPilot;

public class Main {

    public static void main(String[] args) {
	    printDescription();
	    demonstratePattern();
    }

    private static void printDescription(){
        System.out.println("*****************************************************************");
        System.out.println("Design Pattern: TEMPLATE METHOD");
        System.out.println("Pattern Type: BEHAVIORAL");
        System.out.println("Bottom Line");
        System.out.println("* ");
        System.out.println("*****************************************************************");
    }

    private static void demonstratePattern(){

        PreparedCessnaPilot cessnaPilot = new PreparedCessnaPilot();
        PreparedSportCruiserPilot cruiserPilot = new PreparedSportCruiserPilot();

        cessnaPilot.executeEmergencyLanding();
        cruiserPilot.executeEmergencyLanding();

    }
}
