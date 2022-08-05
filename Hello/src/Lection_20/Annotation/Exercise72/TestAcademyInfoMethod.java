package Lection_20.Annotation.Exercise72;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAcademyInfoMethod {
    public static void main(String[] args) throws InvocationTargetException,
            IllegalAccessException {
        AcademyInfoMethod test = new AcademyInfoMethod();
        for (Method m : test.getClass().getDeclaredMethods()) {
            Annotation[] ann = m.getAnnotationsByType(AcademyInfo.class);
            if (ann.length != 0) {
                System.out.println("Найден метод с искомой аннотацией, это - "
                        + m.getName());
            } else {
                System.out.println("Найден метод без искомой аннотации, это - "
                        + m.getName());
            }
            System.out.println("Результат выполнения этого метода такой:");
            m.invoke(test);
        }
    }
}

