package command;

import command.interfaces.Command;

import java.util.ArrayList;
import java.util.List;

// This class is the INVOKER in the Command pattern, note this object has no knowledge of either the recipient of the command, nor the command logic to be executed
// it only knows how to manage a list of Commands
public class MarineBombingMissionSimulator {

    List<Command> simulations;

    public MarineBombingMissionSimulator() {
        simulations = new ArrayList<Command>();
    }

    public void addSimulationScenario(Command simulation){
        simulations.add(simulation);
    }

    public void executSimulationScenarios(){
        for(Command simulation: simulations){
            simulation.execute();
        }
    }
}
