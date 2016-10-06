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

    private String color;
    private int year;
    private boolean soundEnabled;

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

    @Override
    public String toString() {
        return "ModelT1000{" +
                "head=" + head +
                ", hand=" + hand +
                ", leg=" + leg +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", soundEnabled=" + soundEnabled +
                '}';
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}
