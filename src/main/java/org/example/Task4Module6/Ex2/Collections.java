package org.example.Task4Module6.Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections {

    public static <List> ArrayList<List> removeDuplicates(ArrayList<List> list) {
        ArrayList<List> newList = new ArrayList<>();
        for (List element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5, 6, 6, 6, 6));
        System.out.println("ArrayList with duplicates: " + list);
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
}

