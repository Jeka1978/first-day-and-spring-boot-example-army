package army.my.spring;

/**
 * @author Evgeny Borisov
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void clean(){
        speaker.say("I started");
        cleaner.clean();
        speaker.say("I finished");
    }
}
