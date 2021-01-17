package com.bwcompany.util;

//Logical static classes
public final class Util {
    //...

    private Util() {}

    public static String capitalize(String s)
    {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
