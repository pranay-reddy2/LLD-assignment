public class Main {

    public static void main(String[] args) {

        BudgetLedger ledger = new BudgetLedger();
        MinutesBook book = new MinutesBook();
        EventPlanner planner = new EventPlanner();

        TreasurerTool treasurer = new TreasurerTool(ledger);
        SecretaryTool secretary = new SecretaryTool(book);
        EventLeadTool eventLead = new EventLeadTool(planner);

        ClubConsole console =
                new ClubConsole(treasurer, secretary, eventLead);

        console.run();
    }
}