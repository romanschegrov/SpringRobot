import impls.robot.ModelT1000;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by ramon on 05.10.2016.
 */
public class Start {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = new GenericXmlApplicationContext("context.xml")) {
            ModelT1000 t1000 = context.getBean("t1000", ModelT1000.class);
            t1000.dance();
        }
    }
}
