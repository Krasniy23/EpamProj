package org.example.Task4Module6.Ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Replace {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 3);
        map.put("c", 3);
        map.put("d", 4);

        System.out.println(mapReplace(map));
    }

    public static <K, V> Map<V, ArrayList<K>> mapReplace(Map<K, V> initialMap) {
        Map<V, ArrayList<K>> resultMap = new HashMap<>();

        for (Entry<K, V> entry : initialMap.entrySet()) {
            System.out.println(resultMap);

            if (resultMap.get(entry.getValue()) != null) {
                resultMap.get(entry.getValue()).add(entry.getKey());
            } else {
                ArrayList<K> valueList = new ArrayList<>();
                valueList.add(entry.getKey());
                resultMap.put(entry.getValue(), valueList);
            }
        }
        return resultMap;
    }
}
