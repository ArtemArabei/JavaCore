package Lection_20.Annotation;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class TestAnnotation {

    @Version(info = "3.14")
    @XmlAttribute(attribute = "12")
    @XmlElement(element = "23")
    public void checkAnnotation() {
        System.out.println("some method");
    }

    @Version(info = "3.15")
    @XmlAttribute(attribute = "122")
    @XmlElement(element = "233")
    public void checkAnnotation1() {
        System.out.println("some method");
    }

    public static void main(String[] args) throws NoSuchFieldException, IOException, SAXException, ParserConfigurationException {
        AnnotationAnalizator analyzer = new AnnotationAnalizator();
        analyzer.analyz(TestAnnotation.class);


    }
}