package com.company.jaxb.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;


public class Text {

    private String name;
    private String value;

    @XmlAttribute
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    @XmlValue
    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }
}
