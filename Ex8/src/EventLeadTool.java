public class EventLeadTool implements EventOps {

    private final EventPlanner planner;

    public EventLeadTool(EventPlanner planner) {
        this.planner = planner;
    }

    @Override
    public void createEvent(String name, int budget) {
        planner.create(name, budget);
        System.out.println("Event created: " + name + " (budget=" + budget + ")");
    }

    @Override
    public int getEventCount() {
        return planner.count();
    }
}