package army.my.spring;

/**
 * @author Evgeny Borisov
 */
public interface Config {

    <T> Class<T> getImplClass(Class<T> type);
}
