package impls.robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

import java.util.Map;

/**
 * Created by ramon on 06.10.2016.
 */
public abstract class BaseT1000 implements Robot {

    private Head head;
    private Map<String,Hand> hands;
    private Map<String,Leg> legs;

    public BaseT1000() {
    }

    public BaseT1000(Head head, Map<String, Hand> hands, Map<String, Leg> legs) {
        this.head = head;
        this.hands = hands;
        this.legs = legs;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Map<String, Hand> getHands() {
        return hands;
    }

    public void setHands(Map<String, Hand> hands) {
        this.hands = hands;
    }

    public Map<String, Leg> getLegs() {
        return legs;
    }

    public void setLegs(Map<String, Leg> legs) {
        this.legs = legs;
    }
}
