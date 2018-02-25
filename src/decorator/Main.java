package decorator;

import decorator.decorators.FlapsExtendedDecorator;
import decorator.decorators.GearDownDecorator;
import decorator.decorators.UncoordinatedDecorator;
import decorator.implemenations.SportCruiser;
import decorator.interfaces.Airplane;
import decorator.implemenations.DA20;

public class Main {

    public static void main(String[] args) {
	    printDescription();
	    demonstratePattern();
    }

    private static void printDescription(){
        System.out.println("*****************************************************************");
        System.out.println("Design Pattern: DECORATOR");
        System.out.println("Pattern Type: BEHAVIORAL");
        System.out.println("Bottom Line");
        System.out.println("* Attach additional responsibilities to an object dynamically(runtime)");
        System.out.println("* Think of this pattern like a 'DECORATED' Russian doll, nested structure of wrapped objects each delegating down one level to the inner most object");
        System.out.println("* Decorators CAN STAND IN as the object they are decorating - Because they are of the same Type(Abstract Class or Interface");
        System.out.println("* Decorator implemented methods perform additional logic before/after delegating to the wrapped object");
        System.out.println("*****************************************************************");
    }

    private static void demonstratePattern(){
        Airplane diamond = new DA20();
        Airplane dirtyDiamond = new FlapsExtendedDecorator(diamond);
        Airplane dirtyDiamondGearDown = new GearDownDecorator(dirtyDiamond);
        Airplane dirtyDiamondGearDownUncoordinated = new UncoordinatedDecorator(dirtyDiamondGearDown);

        log(diamond);
        log(dirtyDiamond);
        log(dirtyDiamondGearDown);
        log(dirtyDiamondGearDownUncoordinated);

        Airplane sportCruiser = new SportCruiser();
        Airplane dirtySportCriser = new FlapsExtendedDecorator(sportCruiser);
        Airplane dirtySportCriserGearDown = new GearDownDecorator(dirtySportCriser);
        Airplane dirtySportCriserGearDownUncoordinated = new UncoordinatedDecorator(dirtySportCriserGearDown);

        log(sportCruiser);
        log(dirtySportCriser);
        log(dirtySportCriserGearDown);
        log(dirtySportCriserGearDownUncoordinated);
    }

    private static void log(Airplane airplane){
        System.out.println("Description: " + airplane.getDescription());
        System.out.println("Fuel Consumption/Hour: " + airplane.getHourlyFuelBurn());
    }
}
