# 1. Two sum

## Description
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

- Input: nums = [2,7,11,15], target = 9
- Output: [0,1]
- Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

- Input: nums = [3,2,4], target = 6
- Output: [1,2]

Example 3:

- Input: nums = [3,3], target = 6
- Output: [0,1]

## Logic

```java
package main.java.com.oklekot.leetcode.Two_Sum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* 
            I create a hashmap where:
            key = target - value on current index which is remaining 
            value = current index
         */
        HashMap<Integer, Integer> remainingIndexMap = new HashMap<>();
        int[] result = new int[2];
        // Iterate 
        for (int i = 0; i < nums.length; i++) {
            // If value in current cell is some others value compliant we return array of indexes
            // If not, we put another remaining - index pair to our Hashmap 
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
```

## Results

- Runtime: 5ms
- Memory usage: 47 MB
- Time complexity: O(n)

note that both of those parameters may differ a bit in every run.
