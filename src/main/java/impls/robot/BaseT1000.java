package impls.robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

/**
 * Created by ramon on 06.10.2016.
 */
public abstract class BaseT1000 implements Robot {

    private Head head;
    private Hand hand;
    private Leg leg;

    public BaseT1000() {
    }

    public BaseT1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "BaseT1000{" +
                "head=" + head +
                ", hand=" + hand +
                ", leg=" + leg +
                '}';
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
