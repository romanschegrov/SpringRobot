package impls.sony;

import interfaces.Head;

/**
 * Created by ramon on 06.10.2016.
 */
public class SonyHead implements Head {
    @Override
    public void think() {
        System.out.println("think SonyHead");
    }

    public void init() {
        System.out.println("SonyHead init");
    }
}
