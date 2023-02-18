package com.company.jaxb;

import com.company.jaxb.pojo.Resources;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLProcessor {

    public static void main(String[] args) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(Resources.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Resources resources = (Resources) jaxbUnmarshaller.unmarshal(XMLProcessor.class.getClassLoader().getResourceAsStream("locale.xml"));
        System.out.println("Hello World");
    }

}
