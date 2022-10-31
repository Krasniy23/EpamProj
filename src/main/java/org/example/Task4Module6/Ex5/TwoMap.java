package org.example.Task4Module6.Ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoMap {

    public static void main(String[] args) {
        ArrayList<String> firstTeam = new ArrayList<>(Arrays.asList("Charles", "Evelyn", "Madison", "Lily", "Dora", "Michelle", "Cindy", "Vera"));
        ArrayList<String> secondTeam = new ArrayList<>(Arrays.asList("Mila", "Isabella", "Lucy", "Logan"));

        System.out.println(combine(firstTeam, secondTeam));
    }

    public static <K, V> Map<K, V> combine(List<K> listOne, List<V> listTwo) {
        Map<K, V> resultMap = new HashMap<>();

        for (int i = 0; i < listTwo.size(); i++) {
            if (listTwo.get(i) == listTwo.get(listTwo.size() - 1)) {
                resultMap.put(listOne.get(i), listTwo.get(i));
                for (int j = i + 1; j < listOne.size(); j++) {
                    resultMap.put(listOne.get(j), null);
                }
            } else {
                resultMap.put(listOne.get(i), listTwo.get(i));
            }
        }

        return resultMap;
    }
}
