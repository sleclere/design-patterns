package templateMethod.interfaces;

// abstract, since subclasses are meant to define missing abstract methods used by the template method
public abstract class PreparedPilot {

    // final, since subclasses must NOT redefine the template method
    public final void executeEmergencyLanding(){

        // aviate
        executeEngineOutChecklist();

        // navigate
        findSuitableLandingSpot();

        // communicate
        declareAnEmergency();
    }

    public abstract void executeEngineOutChecklist();


    private void findSuitableLandingSpot(){
        System.out.println("Identify the most suitable landing spot within gliding distance and head towards it");
    }

    private void declareAnEmergency(){
        System.out.println("If not already talking to ATC, broadcast 121.5 Mayday Mayday Mayday");
    }
}
