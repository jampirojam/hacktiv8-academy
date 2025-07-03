package com.learning.xmlreader;

import java.util.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

    private List<User> users = new ArrayList<>();
    private User user;

    private boolean bfn = false;
    private boolean bln = false;
    private boolean boc = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if ("user".equals(qName)) {
            user = new User();

            int id = Integer.valueOf(attributes.getValue("id"));
            user.setId(id);
        }
        switch (qName) {
            case "name":
                bfn = true;
                break;

            case "gender":
                bln = true;
                break;

            case "role":
                boc = true;
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (bfn) {
            user.setName(new String(ch, start, length));
            bfn = false;
        }

        if (bln) {
            user.setGender(new String(ch, start, length));
            bln = false;
        }

        if (boc) {
            user.setRole(new String(ch, start, length));
            boc = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("user".equals(qName)) {
            users.add(user);
        }
    }

    public List<User> getUsers() {
        return users;
    }
}