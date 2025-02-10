package com.tutorial.DSA;
import java.util.HashSet;
//Given an unsorted array of integers nums, 
//return the length of the longest consecutive sequence of numbers.
public class LongestConsecutiveSequence {
	/*
	 * Description: Method to return the length of the longest consecutive sequence of numbers
	 * Return: Number
	 * Parameter: Array of Integers
	 */
	public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestStreak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {  
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}