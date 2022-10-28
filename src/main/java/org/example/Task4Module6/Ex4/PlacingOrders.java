package org.example.Task4Module6.Ex4;

import java.util.HashSet;
import java.util.TreeSet;

public class PlacingOrders {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();

        hSet.add("AT&T");
        hSet.add("Verizon");
        hSet.add("Orange");
        hSet.add("GTS");
        hSet.add("Talk Talk");
        hSet.add(null);
        hSet.add(null);
        System.out.println(hSet);

        TreeSet<String> tSets = new TreeSet<>();

        tSets.add("AT&T");
        tSets.add("Verizon");
        tSets.add("Orange");
        tSets.add("GTS");
        tSets.add("Talk Talk");
        System.out.println(tSets);
    }
}
