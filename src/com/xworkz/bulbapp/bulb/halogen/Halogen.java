package com.xworkz.bulbapp.bulb.halogen;

import com.xworkz.bulbapp.bulb.Bulb;

public class Halogen implements Bulb {
    @Override
    public double provideLight() {
        System.out.println("halogen provides light");
        return 0;
    }
}
