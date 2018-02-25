package decorator.decorators;

import decorator.interfaces.Airplane;
import decorator.interfaces.AirplaneDecorator;

public class GearDownDecorator extends AirplaneDecorator {

    private Airplane airplane;

    public GearDownDecorator(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public double getHourlyFuelBurn() {
        return airplane.getHourlyFuelBurn() * 1.3;
    }

    @Override
    public String getDescription(){
        return airplane.getDescription() + " [Gear Down]";
    }
}
