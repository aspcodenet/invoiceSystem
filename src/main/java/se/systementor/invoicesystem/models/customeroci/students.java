package se.systementor.invoicesystem.models.customeroci;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class students {
    @JacksonXmlProperty(localName = "student")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<student> student;
}
