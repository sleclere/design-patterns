package command;

public class Main {

    public static void main(String[] args) {
	    printDescription();
	    demonstratePattern();
    }

    private static void printDescription(){
        System.out.println("*****************************************************************");
        System.out.println("Design Pattern: COMMAND");
        System.out.println("Pattern Type: BEHAVIORAL");
        System.out.println("Bottom Line");
        System.out.println("* Decouple the invoker of some logic(command) from the receiver to execute that logic");
        System.out.println("*****************************************************************");
    }

    private static void demonstratePattern(){

        BombingMissionInstructor instructor = new BombingMissionInstructor();
        instructor.initializeSimulation();
        // some time passes...
        instructor.executeSimulation();
    }
}
