package bankkata;

public class Transaction {

    private final String date;
    private final int amount;

    public Transaction(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + amount;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Transaction that = (Transaction) obj;

        if(amount != that.amount) return false;
        if(date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }
}
