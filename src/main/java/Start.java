import interfaces.Robot;
import interfaces.RobotFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by ramon on 05.10.2016.
 */
public class Start {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = new GenericXmlApplicationContext("context.xml")) {
//            Robot t1000 = context.getBean("t1000", Robot.class);
//            System.out.println(t1000);
//
//            Robot t1001 = context.getBean("t1001", Robot.class);
//            System.out.println(t1001);

            RobotFactory robotFactory = context.getBean("t1000Factory", RobotFactory.class);
            System.out.println(robotFactory);
            Robot robot = robotFactory.newRobot();
            System.out.println(robot);
            robot.action();
        }
    }
}
