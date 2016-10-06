package impls.sony;

import interfaces.Hand;

/**
 * Created by ramon on 06.10.2016.
 */
public class SonyHand implements Hand {
    @Override
    public void wave() {
        System.out.println("wave SonyHand");
    }
}
