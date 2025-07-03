package com.learning.challenge;

import java.util.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {

    private List<User> users = new ArrayList<>();
    private User user;

    private boolean bfn = false;
    private boolean bln = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if ("user".equals(qName)) {
            user = new User();

            int id = Integer.valueOf(attributes.getValue("id"));
            user.setId(id);
        }
        switch (qName) {
            case "firstName":
                bfn = true;
                break;

            case "lastName":
                bln = true;
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (bfn) {
            user.setFirstName(new String(ch, start, length));
            bfn = false;
        }

        if (bln) {
            user.setLastName(new String(ch, start, length));
            bln = false;
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