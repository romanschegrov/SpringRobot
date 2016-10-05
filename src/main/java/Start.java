import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by ramon on 05.10.2016.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("context.xml");
    }
}
