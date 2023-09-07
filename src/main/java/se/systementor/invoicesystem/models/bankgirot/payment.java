package se.systementor.invoicesystem.models.bankgirot;

import java.util.Date;

public class payment {
    public Date dueDate;
    public String terms;
    public method method;
    public overDueFine overDueFine;
    public netAmount netAmount;
    public vatAmount vatAmount;
    public totalAmount totalAmount;
    public roundingAmount roundingAmount;
    public String status;
    public String text;
}
