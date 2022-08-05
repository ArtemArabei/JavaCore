package Lection_19.JSON.Reflection.Students;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.*;

public class TestJson2 {
    public static void main(String[] args) throws IOException {

        // JSON -> Object
        /*byte[] jsonData = ClassLoader.getSystemResourceAsStream("Lection_19/JSON/ListOfStudents.json").readAllBytes();*/


        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:/Users/Artem/IdeaProjects/Hello/src/Lection_19/JSON/ListOfStudents.json"), "WINDOWS-1251"));

        ObjectMapper objectMapper = new ObjectMapper();
        Students students = objectMapper.readValue(br, Students.class);
        System.out.println("Students Object " + students);

        // Object -> JSON
        StringWriter stringStudents = new StringWriter();
        objectMapper.writeValue(stringStudents, students);
        objectMapper.writeValue(new File("C:/Users/Artem/IdeaProjects/Hello/src/Lection_19/JSON/ListOfStudents2.json"), students);
        System.out.println("Academy JSON is\n" + stringStudents);

    }
}

