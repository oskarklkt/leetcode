# 20. Valid Parentheses

## Description
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

## Logic

```java
package com.oklekot.leetcode;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Initializing stack
        Stack<Character> stack = new Stack<>();
        // Initializing a HashMap which holds corresponding parentheses
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        //loop through every character in string
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            // if next character is an opening parenthese, we add it to stack (LIFO)
            if (map.containsValue(c)) {
                stack.push(c);
                /* 
                    Here we check two things:
                    1. If stack is empty? - it means that so far there were more closing brackets than
                    opening brackets - which is makes our parentheses wrong
                    2. If last added to stack opening parenthese is a corresponding 
                    one to character which is now checked, during the check we use
                    .pop() stack method which returns that element and immediately removes it
                    from stack. If stack is empty or parenthese is not corresponding we return false
                 */
            } else if (stack.isEmpty() || map.get(c) != stack.pop()) {
                return false;
            }
        }
        /*
              In the end we check if our stack of
              opening parentheses is now empty 
              (note that is means that number of
              opening parentheses is equal to 
              number of closing parentheses)  
         */
        return stack.isEmpty();
    }
}
```

## Results

Runtime: 2ms
Memory usage: 41 MB

note that both of those parameters may differ a bit in every run.
