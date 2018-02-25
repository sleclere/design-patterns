package factory.simpleFactory;


import factory.simpleFactory.implementations.Revo;
import factory.simpleFactory.implementations.Skyhawk;
import factory.simpleFactory.implementations.SportCruiser;
import factory.simpleFactory.interfaces.Airplane;

public class SimpleAirplaneFactory {

    public Airplane makeAirplane(Category category){

        if(Category.LIGHT_SPORT == category){
            return new SportCruiser();
        }else if (Category.CERTIFIED == category){
            return new Skyhawk();
        }else if(Category.WEIGHT_SHIFT == category){
            return new Revo();
        }

        return null;
    }
}
