package army.my.spring;

import lombok.ToString;

/**
 * @author Evgeny Borisov
 */
@ToString
public class Elf {
    @InjectRandom(min = 10, max = 15)
    private int power;
    @InjectRandom(min = 10, max = 15)
    private int speed;

}
