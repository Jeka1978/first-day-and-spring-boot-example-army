package army.reflections;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class ApiGenerator {


    @SneakyThrows
    public static void runNeededMethods(Object o) {
        Method[] methods = o.getClass().getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")|| method.isAnnotationPresent(Start.class)) {
                method.invoke(o);
            }


        }
    }

    public static void printApi(Object o) {
        Class<?> type = o.getClass();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        Field[] fields = type.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));

    }
}
