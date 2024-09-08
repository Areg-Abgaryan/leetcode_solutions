/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.integer;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/count-primes/">...</a>
 */
public class CountPrimes {

    public static void demo() {

        System.out.println("\nDemo CountPrimes problem :");

        final int num = 192;
        System.out.println(solution(num));
    }

    /**
     * O(n^1.5) complexity + O(n) space
     */
    static int solution(int num) {

        //  Simple cases
        if (num < 3) return 0;

        boolean[] isPrimeBoolArray = new boolean[num];
        Arrays.fill(isPrimeBoolArray, true);

        isPrimeBoolArray[0] = false;
        isPrimeBoolArray[1] = false;

        //  Start with the first prime number, 2
        for (int i = 2; i * i < num; ++i) {
            if (isPrimeBoolArray[i]) {
                //  Mark all multiples of i as not prime
                for (int j = i * i; j < num; j += i) {
                    isPrimeBoolArray[j] = false;
                }
            }
        }

        //  Count prime numbers
        int count = 0;
        for (int i = 2; i < num; ++i) {
            if (isPrimeBoolArray[i]) {
                ++count;
            }
        }

        return count;
    }

    /**
     * O(n^1.5) complexity + O(1) space
     */
    static int naiveSolution(int num) {

        //  Simple cases
        if (num < 3) return 0;

        //  2 is the only even prime number
        int countPrimeNumbers = 1;

        for (int i = 3; i < num; i += 2) {
            if (isPrime(i)) {
                ++countPrimeNumbers;
            }
        }

        return countPrimeNumbers;
    }

    private static boolean isPrime(int num) {

        //  Simple cases
        if (num == 2) return true;
        if (num < 2 || num % 2 == 0) return false;

        //  Check divisibility from 3 up to the square root of n
        for (int i = 3; i * i <= num; ++i) {
            if (num % i == 0) {
                return false;
            }
        }

        //  If no divisors were found, n is prime
        return true;
    }
}
