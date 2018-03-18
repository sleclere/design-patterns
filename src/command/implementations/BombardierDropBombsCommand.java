package command.implementations;

import command.Bombardier;
import command.interfaces.Command;

public class BombardierDropBombsCommand implements Command {

    Bombardier bombardier;

    public BombardierDropBombsCommand(Bombardier bombardier) {
        this.bombardier = bombardier;
    }

    @Override
    public void execute() {
        bombardier.bombsAway();
    }
}
