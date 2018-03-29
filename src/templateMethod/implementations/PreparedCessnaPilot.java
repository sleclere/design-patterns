package templateMethod.implementations;

import templateMethod.interfaces.PreparedPilot;

public class PreparedCessnaPilot extends PreparedPilot {
    @Override
    public void executeEngineOutChecklist() {
        System.out.println("Execute Cessna checklist items!");
    }
}
