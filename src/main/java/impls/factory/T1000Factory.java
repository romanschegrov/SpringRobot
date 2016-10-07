package impls.factory;

import interfaces.Robot;
import interfaces.RobotFactory;

/**
 * Created by ramon on 07.10.2016.
 */
public abstract class T1000Factory implements RobotFactory {

    @Override
    public abstract Robot newRobot();
}
