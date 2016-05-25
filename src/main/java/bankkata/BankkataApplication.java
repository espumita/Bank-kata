package bankkata;

public class BankkataApplication {

    public static void main(String[] args) {
        Clock clock = new Clock();
        TransactionRepository transactionRepository = new TransactionRepository(clock);
        Console console = new Console();
        StatementPrinter statementPrinter = new StatementPrinter(console);
        Account account = new Account(transactionRepository, statementPrinter);

        account.deposit(1000);
        account.withdraw(100);
        account.deposit(500);

        account.printStatement();

    }
}
