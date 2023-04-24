import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

            DocumentBuilder documentBuilder;

            {
                try {
                    documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                } catch (ParserConfigurationException e) {
                    throw new RuntimeException(e);
                }
            }

            Document document;

            {
                try {
                    document = documentBuilder.parse("Vehicle.xml");
                } catch (SAXException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            Node root = document.getDocumentElement();
            NodeList vehicles = root.getChildNodes();



    for (int i = 0;  i < vehicles.getLength(); i++)
            {
                Node machine = vehicles.item(i);
                if (machine.getNodeType() != Node.TEXT_NODE) {
                    NodeList parameters = machine.getChildNodes();
                   // String [] X = new String[];
                    for (int j = 0; j < parameters.getLength(); j++) {
                        Node musicProp = parameters.item(j);
                        if (musicProp.getNodeType() != Node.TEXT_NODE) {
                           // X[j]=(musicProp.getChildNodes().item(0).getTextContent());
                        }
                    }
                }
    }
}
}
