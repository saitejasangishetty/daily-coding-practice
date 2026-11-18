
/*
 * Problem: Remove Duplicates from Sorted Array
 * LeetCode Number: 26
 * Difficulty: Easy
 * Topic: Arrays
 *
 * Approach: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {

                nums[i + 1] = nums[j];
                i++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArray sol =
                new RemoveDuplicatesFromSortedArray();

        int[] nums = {1, 1, 2, 2, 3};

        int k = sol.removeDuplicates(nums);

        System.out.println("Unique elements count: " + k);

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
