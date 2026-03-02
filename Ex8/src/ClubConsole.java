public class ClubConsole {

    private final FinanceOps finance;
    private final MinutesOps minutes;
    private final EventOps events;

    public ClubConsole(FinanceOps finance,
                       MinutesOps minutes,
                       EventOps events) {

        this.finance = finance;
        this.minutes = minutes;
        this.events = events;
    }

    public void run() {

        System.out.println("=== Club Admin ===");

        finance.addIncome(5000, "sponsor");
        minutes.addMinutes("Meeting at 5pm");
        events.createEvent("HackNight", 2000);

        System.out.println(
            "Summary: ledgerBalance=" + finance.getBalance()
            + ", minutes=" + minutes.getMinutesCount()
            + ", events=" + events.getEventCount()
        );
    }
}