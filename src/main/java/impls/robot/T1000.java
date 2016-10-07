package impls.robot;

/**
 * Created by ramon on 06.10.2016.
 */
public class T1000 extends BaseT1000 {

    private String color;
    private int year;
    private boolean soundEnabled;

    @Override
    public void action() {
        getHead().think();
        getHands().get("left").wave();
        getHands().get("right").wave();
        getLegs().get("left").go();
        getLegs().get("right").go();
    }

    @Override
    public void dance() {
        System.out.println("T1000 dancing");
    }

    @Override
    public String toString() {
        return "T1000{" +
                "hashCode=" + hashCode() +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", soundEnabled=" + soundEnabled +
                '}';
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

    public void init() {
        System.out.println("init T1000");
    }

    public void destroy() {
        System.out.println("destroy T1000");
    }
}
