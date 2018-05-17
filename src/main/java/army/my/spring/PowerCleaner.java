package army.my.spring;

/**
 * @author Evgeny Borisov
 */
public class PowerCleaner implements Cleaner {
    @InjectRandom(min = 3,max = 9)
    private int repeat;
    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("FFFFFFFshhhhhhhhhh");

        }
    }
}
