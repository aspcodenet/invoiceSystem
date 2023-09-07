package se.systementor.invoicesystem.models.customeroci;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class student {
    @JacksonXmlProperty(localName = "name")
    public String name;
    @JacksonXmlProperty(localName = "region")
    public String region;
    @JacksonXmlProperty(localName = "country")
    public String country;
    @JacksonXmlProperty(localName = "numberrange")
    public int numberrange;
}
