package command.implementations;

import command.Pilot;
import command.interfaces.Command;

public class PilotCarrierLandingCommand implements Command {

    Pilot pilot;

    public PilotCarrierLandingCommand(Pilot pilot) {
        this.pilot = pilot;
    }

    @Override
    public void execute() {
        pilot.executeCarrierLanding();
    }
}
