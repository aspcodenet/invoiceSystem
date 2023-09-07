package se.systementor.invoicesystem.models.bankgirot;

import java.util.List;

public class invoice {
    public invoiceDetails invoiceDetails;
    public List<invoiceRow> invoiceRow;
    public seller seller;
    public buyer buyer;
    public payment payment;
    public int id;
    public String type;
    public String text;
}
