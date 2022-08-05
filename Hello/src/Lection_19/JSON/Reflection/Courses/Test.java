package Lection_19.JSON.Reflection.Courses;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class Test {
    public static void main(String[] args) throws IOException {

        // JSON -> Object
        byte[] jsonData = ClassLoader.getSystemResourceAsStream("Lection_19/JSON/Reflection/Courses/academy.json").readAllBytes();
        ObjectMapper objectMapper = new ObjectMapper();
        Academy academy = objectMapper.readValue(jsonData, Academy.class);
        System.out.println("Academy Object " + academy);

        // Object -> JSON
        StringWriter stringAcademy = new StringWriter();
        objectMapper.writeValue(stringAcademy, academy);
        objectMapper.writeValue(new File("C:/Users/Artem/IdeaProjects/Hello/src/Lection_19/JSON/Reflection/Courses/academy2.json"), academy);
        System.out.println("Academy JSON is\n" + stringAcademy);

    }
}
