package Lection_19.JSON.Reflection.Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class reflection = Reflection.class;
        for (Field f : reflection.getFields()) {
            System.out.println(f.getName() + " " + f.getType());
        }
        System.out.println();
        Field field = reflection.getField("ex1");
        for (Annotation a : field.getDeclaredAnnotations()) {
            System.out.println(a.annotationType());
        }
        System.out.println();
        Reflection instance = new Reflection();
        //Object value = field.get(instance);
        field.set(instance, "value");
        System.out.println("Field ex1 = " + instance.ex1);
        System.out.println();
        //Method[] methods = example.getMethods();
        Method method = reflection.getMethod("addPrefix", new
                Class[]{String.class});
        //Class[] parameterTypes = method.getParameterTypes();
        //Class returnType = method.getReturnType();
        System.out.println("After method: " + method.invoke(instance, instance.ex1));
    }
}

