package decorator.interfaces;

public abstract class Airplane {
    public abstract double getHourlyFuelBurn();

    public String getDescription(){
        return "Airplane";
    }
}
