package Lection_19.JSON.Reflection.Students;

public class Student {
    private String family;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Student{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
