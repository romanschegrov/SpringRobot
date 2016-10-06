import interfaces.Robot;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by ramon on 05.10.2016.
 */
public class Start {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = new GenericXmlApplicationContext("context.xml")) {
            Robot t1000 = context.getBean("t1000", Robot.class);
            t1000.dance();
            t1000.action();
            System.out.println(t1000);

            t1000 = context.getBean("t1000", Robot.class);
            System.out.println(t1000);

            Robot t2000 = context.getBean("t1001", Robot.class);
            t2000.dance();
            t2000.action();
            System.out.println(t2000);
        }
    }
}
