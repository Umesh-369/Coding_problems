# Smallest Palindromic Rearrangement I

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a  **palindromic**  string `s`.

Return the  **lexicographically smallest**  palindromic permutation of `s`.

 

 **Example 1:** 

 **Input:**  s = "z"

 **Output:**  "z"

 **Explanation:** 

A string of only one character is already the lexicographically smallest palindrome.

 **Example 2:** 

 **Input:**  s = "babab"

 **Output:**  "abbba"

 **Explanation:** 

Rearranging `"babab"` → `"abbba"` gives the smallest lexicographic palindrome.

 **Example 3:** 

 **Input:**  s = "daccad"

 **Output:**  "acddca"

 **Explanation:** 

Rearranging `"daccad"` → `"acddca"` gives the smallest lexicographic palindrome.

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.
- s is guaranteed to be palindromic.

## Solution

**Language:** Java  
**Runtime:** 38 ms (beats 17.67%)  
**Memory:** 48.3 MB (beats 23.69%)  
**Submitted:** 2026-07-28T14:03:29.361Z  

```java
class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int halflen=n/2;
        char[] lefthalf=s.substring(0,halflen).toCharArray();
       Arrays.sort(lefthalf);
       StringBuilder sb=new StringBuilder();
       sb.append(lefthalf);
       if(n%2!=0){
        sb.append(s.charAt(halflen));
       }

       for(int i=lefthalf.length-1;i>=0;i--){
        sb.append(lefthalf[i]);
       }
       return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-palindromic-rearrangement-i/)