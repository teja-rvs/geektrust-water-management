package com.example.geektrust;

import com.example.geektrust.model.TankWaterSlab;

import java.util.Arrays;
import java.util.List;

public class Prices {
    public static final double CORPORATION_WATER = 1.0d;
    public static final double BOREWELL_WATER = 1.5d;

    public static final List<TankWaterSlab> tankWaterSlabs = Arrays.asList(
            new TankWaterSlab(0d, 500d, 2.0),
            new TankWaterSlab(500d, 1500d, 3.0),
            new TankWaterSlab(1501d, 3000d, 5.0),
            new TankWaterSlab(3001d, Double.MAX_VALUE, 8.0)
    );

    private Prices(){}
}
