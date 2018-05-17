package army;

import com.army.reflections.Person;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().name("Jeka").age(39)
                .beer("Leff", 3)
                .build();
        System.out.println("person = " + person);

    }
}
