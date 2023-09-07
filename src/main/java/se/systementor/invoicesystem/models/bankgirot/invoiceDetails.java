package se.systementor.invoicesystem.models.bankgirot;

import java.util.Date;
import java.util.List;

public class invoiceDetails {
    public invoiceType invoiceType;
    public identifier identifier;
    public int invoiceNumber;
    public Date invoiceDate;
    public invoiceTotal invoiceTotal;
    public vatAmount vatAmount;
    public List<String> text;
    public String URL;
    public expenses expenses;
}
