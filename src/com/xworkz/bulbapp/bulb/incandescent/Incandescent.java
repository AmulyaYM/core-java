package com.xworkz.bulbapp.bulb.incandescent;

import com.xworkz.bulbapp.bulb.Bulb;

public class Incandescent implements Bulb {
    @Override
    public double provideLight() {
        System.out.println("incandescent provide light");
        return 0;
    }
}
