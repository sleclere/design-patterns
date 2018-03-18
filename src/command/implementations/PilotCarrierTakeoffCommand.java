package command.implementations;

import command.Pilot;
import command.interfaces.Command;

public class PilotCarrierTakeoffCommand implements Command {

    Pilot pilot;

    public PilotCarrierTakeoffCommand(Pilot pilot) {
        this.pilot = pilot;
    }

    @Override
    public void execute() {
        pilot.executeCarrierTakeoff();
    }
}
