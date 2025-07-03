package com.learning.domxmlreader;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseUnknownXML {
   public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();

      Document document = builder.parse(new File("src/resources/employees.xml"));

      document.getDocumentElement().normalize();

      Element root = document.getDocumentElement();
      System.out.println(root.getNodeName());

      NodeList nList = document.getElementsByTagName("employee");
      System.out.println("============================");

      visitChildNodes(nList);
   }

   private static void visitChildNodes(NodeList nList) {
      for (int temp = 0; temp < nList.getLength(); temp++) {
         Node node = nList.item(temp);
         if (node.getNodeType() == Node.ELEMENT_NODE) {
            System.out.println("Node Name = " + node.getNodeName() + "; Value = " + node.getTextContent());
            if (node.hasAttributes()) {
               NamedNodeMap nodeMap = node.getAttributes();
               for (int i = 0; i < nodeMap.getLength(); i++) {
                  Node tempNode = nodeMap.item(i);
                  System.out.println("Attr name : " + tempNode.getNodeName() + "; Value = " + tempNode.getNodeValue());
               }
               if (node.hasChildNodes()) {
                  visitChildNodes(node.getChildNodes());
               }
            }
         }
      }
   }
}