package Lection_19.JSON.Reflection.Students;

import java.util.List;

public class Students {
    private String group;
    private Course course;
    private List<Student> students;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Students{" +
                "group='" + group + '\'' +
                ", course=" + course +
                ", students=" + students +
                '}';
    }
}
