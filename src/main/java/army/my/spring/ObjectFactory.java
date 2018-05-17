package army.my.spring;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private DataFactory dataFactory = new DataFactory();
    private Config config =  new JavaConfig();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }

        T t = type.newInstance();

        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandom.class)) {
                InjectRandom annotation = field.getAnnotation(InjectRandom.class);
                int min = annotation.min();
                int max = annotation.max();
                int value = dataFactory.getNumberBetween(min, max);
                field.setAccessible(true);
                field.set(t,value);
            }
            if (field.isAnnotationPresent(InjectByType.class)) {
                Object object = createObject(field.getType());
                field.setAccessible(true);
                field.set(t, object);
            }
        }

        return t;

    }



















}
