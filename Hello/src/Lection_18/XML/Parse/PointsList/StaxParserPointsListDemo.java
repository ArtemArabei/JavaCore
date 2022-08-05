package Lection_18.XML.Parse.PointsList;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StaxParserPointsListDemo {
    public static void main(String[] args) throws XMLStreamException {
        List<Point> pointList = new ArrayList<>();
        Point currentPoint = null;
        String tagContent = null;
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(ClassLoader
                .getSystemResourceAsStream("Lection_18/XML/parse/PointsList/" +
                        "PointsList.xml"));
        while (reader.hasNext()) {
            int event = reader.next();
            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    if ("point".equals(reader.getLocalName())) {
                        currentPoint = new Point();
                    }
                    if ("points".equals(reader.getLocalName())) {
                        pointList = new ArrayList<>();
                    }
                    break;
                case XMLStreamConstants.CHARACTERS:
                    tagContent = reader.getText().trim();
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    switch (reader.getLocalName()) {
                        case "point":
                            pointList.add(currentPoint);
                            break;
                        case "x":
                            currentPoint.xCoordinate = Integer
                                    .parseInt(tagContent);
                            break;
                        case "y":
                            currentPoint.yCoordinate = Integer
                                    .parseInt(tagContent);
                            break;
                    }
                    break;
                case XMLStreamConstants.START_DOCUMENT:
                    pointList = new ArrayList<>();
                    break;
            }
        }
        for (Point point : pointList) {
            System.out.println(point);
        }
    }
}
