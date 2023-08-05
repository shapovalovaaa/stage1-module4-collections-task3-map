package com.epam.mjc.collections.map;

import java.util.*;
import java.util.stream.Collectors;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordsFrequency = new HashMap<>();

        if (!sentence.isEmpty()) {
            List<String> words = Arrays.stream(sentence.toLowerCase().replaceAll("\\p{Punct}", "").split(" "))
                    .collect(Collectors.toList());
            Set<String> uniqueWords = new HashSet<>(words);
            for (String word : uniqueWords) {
                wordsFrequency.put(word, Collections.frequency(words, word));
            }
        }
        return wordsFrequency;
    }
}
