package command;

import command.implementations.BombardierAcquireTargetCommand;
import command.implementations.BombardierDropBombsCommand;
import command.implementations.PilotCarrierLandingCommand;
import command.implementations.PilotCarrierTakeoffCommand;
import command.interfaces.Command;

// the instructor is the CLIENT in the COMMAND pattern.  The instructor knows which simulations to run and which recipients will be involved in the simulation
public class BombingMissionInstructor {

    // this testing scenario needs a pilot and a bombardier
    Pilot pilot;
    Bombardier bombardier;

    MarineBombingMissionSimulator simulator;

    public void initializeSimulation(){
        simulator = new MarineBombingMissionSimulator();
        pilot = new Pilot();
        bombardier = new Bombardier();

        Command takeoff = new PilotCarrierTakeoffCommand(pilot); // recipient and command logic bound
        Command acquireTarget = new BombardierAcquireTargetCommand(bombardier); // recipient and command logic bound
        Command bombsAway = new BombardierDropBombsCommand(bombardier); // recipient and command logic bound
        Command landing = new PilotCarrierLandingCommand(pilot); // recipient and command logic bound

        simulator.addSimulationScenario(takeoff);
        simulator.addSimulationScenario(acquireTarget);
        simulator.addSimulationScenario(bombsAway);
        simulator.addSimulationScenario(landing);
    }

    public void executeSimulation(){
        simulator.executSimulationScenarios();
    }
}
