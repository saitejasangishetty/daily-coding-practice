
/*
 * Problem: Reverse String
 * LeetCode Number: 344
 * Difficulty: Easy
 * Topic: String / Two Pointers
 *
 * Approach:
 * Swap characters from both ends
 * until the pointers meet.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        char k;

        while (i < j) {

            k = s[i];
            s[i] = s[j];
            s[j] = k;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}