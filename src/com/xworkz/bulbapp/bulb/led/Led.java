package com.xworkz.bulbapp.bulb.led;

import com.xworkz.bulbapp.bulb.Bulb;

public class Led implements Bulb {
    @Override
    public double provideLight() {
        System.out.println("Led  bulb provide light");
        return 0;
    }
}
