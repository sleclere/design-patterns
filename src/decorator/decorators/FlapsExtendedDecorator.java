package decorator.decorators;

import decorator.interfaces.Airplane;
import decorator.interfaces.AirplaneDecorator;

public class FlapsExtendedDecorator extends AirplaneDecorator {

    private Airplane airplane;

    public FlapsExtendedDecorator(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public double getHourlyFuelBurn() {
        return airplane.getHourlyFuelBurn() * 1.1;
    }

    @Override
    public String getDescription(){
        return airplane.getDescription() + " [Flaps Down]";
    }
}
