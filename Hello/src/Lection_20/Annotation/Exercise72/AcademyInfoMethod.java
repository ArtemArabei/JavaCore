package Lection_20.Annotation.Exercise72;

public class AcademyInfoMethod {
    @AcademyInfo(year = "2022")
    public void checkMethodWithAnnotation() {
        System.out.println("��� ����� � ����������\n");
    }

    public void checkMethodWithoutAnnotation() {
        System.out.println("��� ����� ��� ���������\n");
    }
}
