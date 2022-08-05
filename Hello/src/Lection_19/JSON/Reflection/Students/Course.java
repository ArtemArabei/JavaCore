package Lection_19.JSON.Reflection.Students;

public class Course {
    private String language;
    private String name;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "course{" +
                "language='" + language + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
