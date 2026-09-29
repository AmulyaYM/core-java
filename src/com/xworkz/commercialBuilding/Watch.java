package com.xworkz.commercialBuilding;

import commercialBuilding.CommercialBuilding;

public class Watch implements CommercialBuilding {
    @Override
    public double doBusiness() {
        System.out.println("watch business");
        return 1000.00;
    }
}
