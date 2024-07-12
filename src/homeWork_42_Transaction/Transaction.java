package homeWork_42_Transaction;

public class Transaction {
    private double amount;
    private String type;
    private String timestamp;

    public Transaction(double amount, String type, String timestamp) {
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}