package army.reflections;

import lombok.*;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    public void test1111(){
        System.out.println("111111111");
    }

    public void test2222222(){
        System.out.println("222222222222222");
    }

    @Start
    public void doWork(){
        System.out.println("WORKING....");
    }

    @Singular
    private Map<String, Integer> beers;
    @NonNull
    private String name;
    private int age;
    private boolean drunk;

}

