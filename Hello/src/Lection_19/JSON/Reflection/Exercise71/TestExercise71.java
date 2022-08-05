package Lection_19.JSON.Reflection.Exercise71;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestExercise71 {
    public static void main(String[] args) throws InvocationTargetException,
            IllegalAccessException, NoSuchMethodException {
        Class reflection = Exercise71.class;
        Exercise71 ex = new Exercise71();
        Method method = reflection.getMethod("printHelloWorld", null);
        method.invoke(ex, null);
    }
}
