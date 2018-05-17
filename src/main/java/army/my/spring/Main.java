package army.my.spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        ObjectFactory.getInstance().createObject(IRobot.class).clean();

       /* Arrays.stream(args).forEach(System.out::println);
        Elf elf = new Elf();
        System.out.println(elf);
        Elf elf1 = ObjectFactory.getInstance().createObject(Elf.class);
        System.out.println("elf1 = " + elf1);*/
    }
}
