package org.example.Task4Module6.Ex3;

import java.util.LinkedList;

public class Replace {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println("New list" + list);

        list.set(1, "1111");
        System.out.println("\n3rd Element Replaced \n");
        for (String str2 : list) {
            System.out.println(str2);
        }
    }
}