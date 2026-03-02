public class TreasurerTool implements FinanceOps {

    private final BudgetLedger ledger;

    public TreasurerTool(BudgetLedger ledger) {
        this.ledger = ledger;
    }

    @Override
    public void addIncome(int amount, String source) {
        ledger.add(amount, source); 
        System.out.println("Ledger: +" + amount + " (" + source + ")");
    }

    @Override
    public int getBalance() {
        return (int) ledger.balanceInt();
    }
}