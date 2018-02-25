package decorator.decorators;

import decorator.interfaces.Airplane;
import decorator.interfaces.AirplaneDecorator;

public class UncoordinatedDecorator extends AirplaneDecorator {

    private Airplane airplane;

    public UncoordinatedDecorator(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public double getHourlyFuelBurn() {
        return airplane.getHourlyFuelBurn() * 1.2;
    }

    @Override
    public String getDescription(){
        return airplane.getDescription() + " [Uncoordinated]";
    }
}
