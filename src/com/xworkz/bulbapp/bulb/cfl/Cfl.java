package com.xworkz.bulbapp.bulb.cfl;

import com.xworkz.bulbapp.bulb.Bulb;

public class Cfl implements Bulb {
    @Override
    public double provideLight() {
        System.out.println("Cfl bulb provides light");
        return 0;
    }
}
