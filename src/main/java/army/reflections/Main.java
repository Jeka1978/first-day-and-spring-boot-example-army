package army.reflections;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().name("Shay").build();
        ApiGenerator.runNeededMethods(person);
    }
}
