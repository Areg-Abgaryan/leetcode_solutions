/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/longest-palindrome/">...</a>
 */
public class LongestPalindrome {

    public static void demo() {

        System.out.println("\nDemo LongestPalindrome problem :");

        final String str = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(solution(str));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static int solution(String str) {

        //  Store the values in a map
        final Map<Character, Integer> char2Value = new HashMap<>();
        for (char c : str.toCharArray()) {
            char2Value.put(c, char2Value.getOrDefault(c, 0) + 1);
        }

        int palindromeLength = 0;
        boolean singleElementUsed = false;

        for (int value : char2Value.values()) {
            if (value % 2 == 0) {
                palindromeLength += value; // Add even counts directly
            } else {
                palindromeLength += value - 1; // Add the even part of odd counts
                singleElementUsed = true;
            }
        }

        //  Allow one character with an odd count as the center of the palindrome
        if (singleElementUsed) {
            palindromeLength++;
        }

        return palindromeLength;
    }
}
