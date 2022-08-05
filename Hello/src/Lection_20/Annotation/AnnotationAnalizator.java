package Lection_20.Annotation;

import java.lang.reflect.Method;

public class AnnotationAnalizator {

    public void analyz(Class<?> clazz) {
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Version.class)) {
                Version version = method.getAnnotation(Version.class);
                String v = version.info();
                System.out.println("version: " + v);
            }
            if (method.isAnnotationPresent(XmlElement.class)) {
                XmlElement element = method.getAnnotation(XmlElement.class);
                String e = element.element();
                System.out.println("element: " + e);
            }
            if (method.isAnnotationPresent(XmlAttribute.class)) {
                XmlAttribute attribute = method.getAnnotation(XmlAttribute.class);
                String a = attribute.attribute();
                System.out.println("attribute: " + a);
            }
        }
    }
}

