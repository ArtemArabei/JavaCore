package Lection_18.XML.Parse.PointsList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;
import java.util.List;

public class SAXParserPointsListDemo {

    public static void main(String[] args) throws Exception {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();
        SAXHandler handler = new SAXHandler();
        parser.parse(ClassLoader.getSystemResourceAsStream("Lection_18/XML/parse/PointsList/PointsList.xml"),
                handler);
        for (Point point : handler.pointList) {
            System.out.println(point);
        }
    }
}

class SAXHandler extends DefaultHandler {
    List<Point> pointList = new ArrayList<>();
    Point point = null;
    String content = null;

    @Override
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes)
            throws SAXException {

        switch (qName) {
            //Create a new Employee object when the start tag is found
            case "point":
                point = new Point();
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName,
                           String qName) throws SAXException {
        switch (qName) {
            case "point":
                pointList.add(point);
                break;
            case "x":
                point.xCoordinate = Integer.parseInt(content);
                break;
            case "y":
                point.yCoordinate = Integer.parseInt(content);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }
}
