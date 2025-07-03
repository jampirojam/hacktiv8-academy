package com.learning.webrank;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.*;
import java.net.*;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class WebRankSearch {
    private static final String ALEXA_API = "http://data.alexa.com/data?cli=10&url=";
    private static Scanner ss = new Scanner(System.in);
    String webdomain;

    public static void main(String[] args) {
        WebRankSearch obj = new WebRankSearch();
        System.out.print("Tulis Web: ");
        String webdomain = ss.nextLine();
        int alexaRank = obj.getAlexaRanking(webdomain);

        System.out.println("Rank: " + alexaRank);
    }

    public int getAlexaRanking(String domain) {

        int result = 0;

        String url = ALEXA_API + domain;

        try {

            URLConnection conn = new URL(url).openConnection();
            InputStream is = conn.getInputStream();

            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder();
            Document doc = dBuilder.parse(is);

            Element element = doc.getDocumentElement();

            NodeList nodeList = element.getElementsByTagName("POPULARITY");
            if (nodeList.getLength() > 0) {
                Element elementAttribute = (Element) nodeList.item(0);
                String ranking = elementAttribute.getAttribute("TEXT");
                if (!"".equals(ranking)) {
                    result = Integer.valueOf(ranking);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
}
