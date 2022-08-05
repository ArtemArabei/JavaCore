package Lection_19.JSON.Reflection.Exercise76;

import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;

public class TestExercise76 {
    public static void main(String[] args) throws IOException {
        byte[] jsonData = ClassLoader.getSystemResourceAsStream("Lection_19/" +
                "JSON/Reflection/Exercise76/Exercise76.json").readAllBytes();
        ObjectMapper objectMapper = new ObjectMapper();
        Exercise76 exercise = objectMapper
                .readValue(jsonData, Exercise76.class);
        System.out.println("Exercise76: " + exercise);
    }
}
