package command.implementations;

import command.Bombardier;
import command.interfaces.Command;

// Command objects bind the receiver with the command logic to execute
public class BombardierAcquireTargetCommand implements Command {

    Bombardier bombardier;

    public BombardierAcquireTargetCommand(Bombardier bombardier) {
        this.bombardier = bombardier;
    }

    @Override
    public void execute() {
        bombardier.acquireTarget();
    }
}
