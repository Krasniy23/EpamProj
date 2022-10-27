package org.example.Task4Module6.Ex3;

import java.util.HashMap;

public class Replace {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 300);
        map.put("c", 300);
        map.put("d", 400);

        System.out.println("HashMap: " + map);

        map.replace("a", 101);
        map.replace("b", 201);
        map.replace("c", 301);
        map.replace("d", 401);
        map.replace("e", 501); // for check that not unused mat not displayed


        System.out.println("New HashMap: " + map);
    }
}
