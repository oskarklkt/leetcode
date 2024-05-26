package main.java.com.oklekot.leetcode.Valid_Parentheses;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsValue(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || map.get(c) != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()[]{}"));
    }
}
