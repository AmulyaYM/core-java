package com.xworkz.bulbapp.bulb.oled;

import com.xworkz.bulbapp.bulb.Bulb;

public class Oled implements Bulb {
    @Override
    public double provideLight() {
        System.out.println("oled provide light");
        return 0;
    }
}
