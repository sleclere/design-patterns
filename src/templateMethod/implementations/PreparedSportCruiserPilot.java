package templateMethod.implementations;

import templateMethod.interfaces.PreparedPilot;

public class PreparedSportCruiserPilot extends PreparedPilot {
    @Override
    public void executeEngineOutChecklist() {
        System.out.println("Execute SportCrusier checklist items!");
    }
}
