package decorator.implemenations;

import decorator.interfaces.Airplane;

public class SportCruiser extends Airplane {

    public String getDescription(){
        return super.getDescription() + "SportCruiser";
    }

    public double getHourlyFuelBurn(){
        return 5;
    }

}
