package Lection_19.JSON.Reflection.Courses;

import java.util.List;

public class Academy {
    private String site;
    private Address address;
    private List<Course> courses;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Academy{" +
                "site='" + site + '\'' +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
}
