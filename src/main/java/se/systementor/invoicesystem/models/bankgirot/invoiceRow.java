package se.systementor.invoicesystem.models.bankgirot;

import java.util.List;

public class invoiceRow {
    public article article;
    public List<String> text;
    public quantity quantity;
    public unitPrice unitPrice;
    public netAmount netAmount;
    public vatAmount vatAmount;
    public totalAmount totalAmount;
    public int id;
}
