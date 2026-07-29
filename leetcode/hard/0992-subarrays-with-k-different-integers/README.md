# Subarrays with K Different Integers

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an integer array `nums` and an integer `k`, return  *the number of  **good subarrays**  of* `nums`.

A  **good array**  is an array where the number of different integers in that array is exactly `k`.

- For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.

A  **subarray**  is a  **contiguous**  part of an array.

 

 **Example 1:** 

```
Input: nums = [1,2,1,2,3], k = 2
Output: 7
Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]

```

 **Example 2:** 

```
Input: nums = [1,2,1,3,4], k = 3
Output: 3
Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- 1 <= nums[i], k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 55 ms (beats 9.87%)  
**Memory:** 48.9 MB (beats 92.86%)  
**Submitted:** 2026-07-29T13:24:39.745Z  

```java
class Solution {
    public int atmostk(int[] nums,int k){
        HashMap<Integer,Integer> freq=new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);
            if(freq.get(nums[right])==1){
                k--;
            }
            while(k<0){
                freq.put(nums[left],freq.get(nums[left])-1);
                if(freq.get(nums[left]) == 0){
                    k++;
                }
                left++;
            }
                count+=(right-left+1);
        }
            return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostk(nums,k)-atmostk(nums,k-1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarrays-with-k-different-integers/)