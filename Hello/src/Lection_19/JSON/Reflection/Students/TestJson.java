package Lection_19.JSON.Reflection.Students;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class TestJson {
    public static void main(String[] args) throws IOException {

        // JSON -> Object
        byte[] jsonData = Thread.currentThread().getContextClassLoader().getSystemResourceAsStream("Lection_19/JSON/Reflection/Students/ListOfStudents.json").readAllBytes();
        ObjectMapper objectMapper = new ObjectMapper();
        Students students = objectMapper.readValue(jsonData, Students.class);
        System.out.println("Students Object " + students);

        // Object -> JSON
        StringWriter stringStudents = new StringWriter();
        objectMapper.writeValue(stringStudents, students);
        objectMapper.writeValue(new File("C:/Users/Artem/IdeaProjects/Hello/src/Lection_19/JSON/ListOfStudents2.json"), students);
        System.out.println("Students Object \n" + stringStudents);

    }
}

