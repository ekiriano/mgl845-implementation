package com.company;


import java.io.File;
import java.util.Hashtable;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;


import org.w3c.dom.Element;


public class Main {

    public static void main(String[] args) {
        //Setup de la table de traduction
        Hashtable<String, String> translationTable = new Hashtable<>();
        translationTable.put("Personne","Person");
        translationTable.put("Client","Customer");
        translationTable.put("Gestionnaire","Manager");
        translationTable.put("Commis","Clerk");
        translationTable.put("DossierClient","CustomerFile");
        translationTable.put("AgenceArivee","ArrivalAgency");
        translationTable.put("Agence","Agency");
        translationTable.put("AgenceDepart","DepartureAgency");
        translationTable.put("Reservation","Booking");
        translationTable.put("Location","Rental");
        translationTable.put("Categorie","Category");
        translationTable.put("Voiture","Car");
        translationTable.put("Transfert","Transfer");
        translationTable.put("Retour","Return");
        translationTable.put("Inspection","Examination");
        try {

            //readfile and builder
            File inputFile = new File("C:\\Users\\ekiriano\\Desktop\\TranslateModel\\src\\com\\company\\mgl845.ecore");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //getAll eClassifiers
            NodeList nList = doc.getElementsByTagName("eClassifiers");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    eElement.setAttribute("name",translationTable.get(eElement.getAttribute("name")));

                }

            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "5");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\ekiriano\\Desktop\\TranslateModel\\src\\com\\company\\mgl845Translated.ecore"));
            transformer.transform(source, result);
            System.out.println("TRANSLATION SUCCESSFUL");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
