package army.my.spring;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {
    @Override
    public void say(String message) {
        System.out.println(message);
    }
}
