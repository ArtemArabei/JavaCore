package Lection_19.JSON.Reflection.Reflection;

import Lection_19.JSON.Reflection.Students.Student;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonRawValue;

public class Reflection {

    @Deprecated
    @JsonIgnore
    @JsonRawValue
    public String ex1;
    public int ex2;
    public Student ex3;

    @Deprecated
    public String addPrefix(String s) {
        return "prefix_" + s;
    }
}

