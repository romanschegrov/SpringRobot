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

    public ModelT1000(Head head, Hand hand) {
        this.head = head;
        this.hand = hand;
    }

    @Override
    public void action() {
        head.think();
        hand.wave();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("ModelT1000 dancing");
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
