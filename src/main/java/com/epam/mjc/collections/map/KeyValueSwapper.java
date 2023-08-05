package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> pair : sourceMap.entrySet()) {
            newMap.merge(pair.getValue(), pair.getKey(), Integer::min);
        }
        return newMap;
    }
}
