package org.example.Task4Module6.Ex4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class PlacingOrders {

    public static void main(String[] args) {
        String[] orders = {"AT&T", "Verizon", "Orange", "GTS", "Talk Talk", "GTS"};

        HashSet<String> hSet = new HashSet<>();

//        hSet.add("AT&T");
//        hSet.add("Verizon");
//        hSet.add("Orange");
//        hSet.add("GTS");
//        hSet.add("Talk Talk");
//        hSet.add(null);
//        hSet.add(null);

        hSet.addAll(Arrays.asList(orders));
        System.out.println(hSet);

        TreeSet<String> tSets = new TreeSet<>();

//        tSets.add("AT&T");
//        tSets.add("Verizon");
//        tSets.add("Orange");
//        tSets.add("GTS");
//        tSets.add("Talk Talk");

        for (String order : orders) {
            tSets.add(order);
        }
        System.out.println(tSets);
    }
}
