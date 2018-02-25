package decorator.implemenations;

import decorator.interfaces.Airplane;

public class DA20 extends Airplane {

    public String getDescription(){
        return super.getDescription() + " [DA20]";
    }

    public double getHourlyFuelBurn(){
        return 6;
    }

}
