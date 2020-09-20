package dev.lootjes.miroga.util;

import java.util.HashMap;

public class StatTypes {

    public static final HashMap<String, Float> AttributeCost =  new HashMap<String, Float>();
    static {
        AttributeCost.put("LIGHT", 1f);
        AttributeCost.put("DARK", 1f);
        AttributeCost.put("WATER", 1f);
        AttributeCost.put("FIRE", 1f);
        AttributeCost.put("EARTH", 1f);
        AttributeCost.put("AIR", 1f);
    }
}
