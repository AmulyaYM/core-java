package com.xworkz.bulbapp.bulb.tubelight;

import com.xworkz.bulbapp.bulb.Bulb;

public class TubeLight implements Bulb {
    @Override
    public double provideLight() {
        System.out.println("Tubelight provide light ");
        return 0;
    }
}
