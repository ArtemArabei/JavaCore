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
                System.out.println("������ ����� � ������� ����������, ��� - "
                        + m.getName());
            } else {
                System.out.println("������ ����� ��� ������� ���������, ��� - "
                        + m.getName());
            }
            System.out.println("��������� ���������� ����� ������ �����:");
            m.invoke(test);
        }
    }
}

