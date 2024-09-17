/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/most-common-word/">...</a>
 */
public class MostCommonWord {

    public static void demo() {

        System.out.println("\nDemo MostCommonWord problem :");

        final String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        final String[] banned = { "hit" };
        System.out.println(solution(paragraph, banned));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static String solution(String paragraph, String[] banned) {

        //  Store banned words in the set for an easy search
        final Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        //  Replace all non-word characters in the string with space and split the string by space
        final String[] paragraphWords = paragraph.toLowerCase().replaceAll("\\W+", " ").split(" ");

        int maxCount = 0;
        String maxCountString = null;

        //  Build a map with words and their occurrences count
        final Map<String, Integer> paragraphMap = new HashMap<>();
        for (String word : paragraphWords) {
            paragraphMap.put(word, paragraphMap.getOrDefault(word, 0) + 1);
        }

        //  Find most occurred non-banned word in the sentence
        for (Map.Entry<String, Integer> entry : paragraphMap.entrySet()) {
            if (! bannedSet.contains(entry.getKey())) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxCountString = entry.getKey();
                }
            }
        }

        return maxCountString;
    }
}
