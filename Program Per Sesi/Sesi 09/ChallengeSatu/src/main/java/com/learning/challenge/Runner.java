package com.learning.challenge;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.*;
import javax.xml.parsers.*;
import org.xml.sax.*;

public class Runner {
    private SAXParser createSaxParser() {
        SAXParser saxParser = null;

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            saxParser = factory.newSAXParser();
        } catch (ParserConfigurationException | SAXException ex) {
            Logger lgr = Logger.getLogger(Runner.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return saxParser;
    }

    public List<User> parseUsers() {

        Handler handler = new Handler();
        String fileName = "src/resources/users.xml";
        File xmlDocument = Paths.get(fileName).toFile();

        try {

            SAXParser parser = createSaxParser();
            parser.parse(xmlDocument, handler);

        } catch (SAXException | IOException ex) {
            Logger lgr = Logger.getLogger(Runner.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return handler.getUsers();
    }
}