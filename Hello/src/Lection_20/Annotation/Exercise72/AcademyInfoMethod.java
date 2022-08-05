package Lection_20.Annotation.Exercise72;

public class AcademyInfoMethod {
    @AcademyInfo(year = "2022")
    public void checkMethodWithAnnotation() {
        System.out.println("Это метод с аннотацией\n");
    }

    public void checkMethodWithoutAnnotation() {
        System.out.println("Это метод без аннотации\n");
    }
}
