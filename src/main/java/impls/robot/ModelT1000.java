package impls.robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

/**
 * Created by ramon on 06.10.2016.
 */
public class ModelT1000 implements Robot {

    private Head head;
    private Hand hand;
    private Leg leg;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void fire() {
        head.think();
        hand.wave();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("ModelT1000 dancing");
    }
}
