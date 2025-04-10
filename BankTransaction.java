// ---------- BankTransaction.java ----------
import javax.persistence.*;
import java.util.Date;

@Entity
public class BankTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int txnId;

    private int fromAcc;
    private int toAcc;
    private double amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date txnDate = new Date();

    public BankTransaction() {}

    public BankTransaction(int fromAcc, int toAcc, double amount) {
        this.fromAcc = fromAcc;
        this.toAcc = toAcc;
        this.amount = amount;
    }

    // Getters and Setters
    public int getTxnId() {
        return txnId;
    }

    public int getFromAcc() {
        return fromAcc;
    }

    public int getToAcc() {
        return toAcc;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTxnDate() {
        return txnDate;
    }
}
