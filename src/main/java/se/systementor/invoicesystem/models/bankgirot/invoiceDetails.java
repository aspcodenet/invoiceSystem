package se.systementor.invoicesystem.models.bankgirot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;


public class invoiceDetails {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public invoiceType invoiceType;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public identifier identifier;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public int invoiceNumber;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public Date invoiceDate;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public invoiceTotal invoiceTotal;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public vatAmount vatAmount;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public List<String> text;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public String URL;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public expenses expenses;
}
