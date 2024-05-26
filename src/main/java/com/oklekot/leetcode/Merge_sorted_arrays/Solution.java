package main.java.com.oklekot.leetcode.Merge_sorted_arrays;


import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {
            nums1[m++] = i;
        }
        Arrays.sort(nums1);
    }
}

class Main {
    public static void main(String[] args) {
        new Solution().merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }
}
