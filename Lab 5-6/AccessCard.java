import java.util.Date;

public class AccessCard {
    private int cardNumber;
    private Date issueDate;

    public AccessCard(int cardNumber, Date issueDate) {
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }
}