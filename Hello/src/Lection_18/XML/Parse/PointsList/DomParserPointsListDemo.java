package Lection_18.XML.Parse.PointsList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class DomParserPointsListDemo {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(ClassLoader.getSystemResourceAsStream
                ("Lection_18/XML/parse/PointsList/PointsList.xml"));
        List<Point> pointList = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Point point = new Point();
                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);
                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().getTextContent()
                                .trim();
                        switch (cNode.getNodeName()) {
                            case "x":
                                point.xCoordinate = Integer.parseInt(content);
                                break;
                            case "y":
                                point.yCoordinate = Integer.parseInt(content);
                                break;
                        }
                    }
                }
                pointList.add(point);
            }
        }
        for (Point point : pointList) {
            System.out.println(point);
        }
    }
}
