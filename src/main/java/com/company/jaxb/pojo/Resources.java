package com.company.jaxb.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "resources")
public class Resources {

    private List<Text> textList;

    @XmlElement(name = "string")
    public List<Text> getTextList() {
        return textList;
    }


    public void setTextList(List<Text> textList) {
        this.textList = textList;
    }

}
