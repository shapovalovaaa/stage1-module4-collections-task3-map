package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();
        sourceList.forEach(i -> functionMap.computeIfAbsent(i, this::getResultFunction));
        return functionMap;
    }

    private Integer getResultFunction(Integer number) {
        return 5 * number + 2;
    }
}
