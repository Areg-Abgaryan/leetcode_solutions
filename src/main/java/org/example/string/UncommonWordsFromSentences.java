/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/uncommon-words-from-two-sentences/">...</a>
 */
public class UncommonWordsFromSentences {

    public static void demo() {

        System.out.println("\nDemo UncommonWordsFromSentences problem :");

        final String s1 = "this apple is sweet", s2 = "this apple is sour";
        System.out.println(Arrays.toString(solution(s1, s2)));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static String[] solution(String s1, String s2) {

        //  Split and get words arrays from two strings
        final String[] s1Array = s1.split(" ");
        final String[] s2Array = s2.split(" ");

        //  Put all the words in a map
        final Map<String, Integer> allWords = new HashMap<>();
        for (String s : s1Array) {
            if (! s.isEmpty())
                allWords.put(s, allWords.getOrDefault(s, 0) + 1);
        }

        for (String s : s2Array) {
            if (! s.isEmpty())
                allWords.put(s, allWords.getOrDefault(s, 0) + 1);
        }

        final List<String> wordsList = new ArrayList<>();
        //  Iterate over the map and find uncommon elements
        allWords.forEach((key, value) -> {
            if (value == 1) {
                wordsList.add(key);
            }
        });

        //  Return the result as a string array
        return wordsList.toArray(new String[0]);
    }
}
