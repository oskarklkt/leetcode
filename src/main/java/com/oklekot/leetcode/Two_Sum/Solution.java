package main.java.com.oklekot.leetcode.Two_Sum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> remainingIndexMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (remainingIndexMap.containsKey(nums[i])) {
                result[0] = remainingIndexMap.get(nums[i]);
                result[1] = i;
            } else {
                remainingIndexMap.put(target - nums[i], i);
            }
        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
