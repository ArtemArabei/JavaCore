package Lection_18.XML.Parse.Student;

import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaxParserStudent {
    public static void main(String[] args) throws XMLStreamException {
        List<Student> empList = null;
        Student currStd = null;
        String tagContent = null;
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader =
                factory.createXMLStreamReader(
                        ClassLoader.getSystemResourceAsStream("Lection_18/XML/parse/student/students.xml"));
        while (reader.hasNext()) {
            int event = reader.next();
            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    if ("student".equals(reader.getLocalName())) {
                        currStd = new Student();
                        currStd.address = new Address();
                        currStd.login = reader.getAttributeValue(0);
                        currStd.faculty = reader.getAttributeValue(1);
                    }
                    if ("students".equals(reader.getLocalName())) {
                        empList = new ArrayList<>();
                    }
                    break;
                case XMLStreamConstants.CHARACTERS:
                    tagContent = reader.getText().trim();
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    switch (reader.getLocalName()) {
                        case "student":
                            empList.add(currStd);
                            break;
                        case "name":
                            currStd.name = tagContent;
                            break;
                        case "telephone":
                            currStd.telephone = tagContent;
                            break;
                        case "country":
                            currStd.address.country = tagContent;
                            break;
                        case "city":
                            currStd.address.city = tagContent;
                            break;
                        case "street":
                            currStd.address.street = tagContent;
                            break;
                    }
                    break;
                case XMLStreamConstants.START_DOCUMENT:
                    empList = new ArrayList<>();
                    break;
            }
        }
        //Print the employee list populated from XML
        for (Student emp : empList) {
            System.out.println(emp);
        }
    }
}