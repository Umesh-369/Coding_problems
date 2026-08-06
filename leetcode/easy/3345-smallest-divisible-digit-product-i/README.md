# Smallest Divisible Digit Product I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given two integers `n` and `t`. Return the  **smallest**  number greater than or equal to `n` such that the  **product of its digits**  is divisible by `t`.

 

 **Example 1:** 

 **Input:**  n = 10, t = 2

 **Output:**  10

 **Explanation:** 

The digit product of 10 is 0, which is divisible by 2, making it the smallest number greater than or equal to 10 that satisfies the condition.

 **Example 2:** 

 **Input:**  n = 15, t = 3

 **Output:**  16

 **Explanation:** 

The digit product of 16 is 6, which is divisible by 3, making it the smallest number greater than or equal to 15 that satisfies the condition.

 

 **Constraints:** 

- 1 <= n <= 100
- 1 <= t <= 10

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 42.5 MB (beats 66.49%)  
**Submitted:** 2026-08-06T16:41:42.885Z  

```java
class Solution {
    public int smallestNumber(int n, int t) {
      for(int i=n;i<=100;i++){
      int product=1;
        int temp=i;
        while(temp>0){
            int ld=temp%10;
             product=product*ld;
            temp=temp/10;
         }
         if(product%t==0){
            return i;
         }
      }
      return n;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-divisible-digit-product-i/)