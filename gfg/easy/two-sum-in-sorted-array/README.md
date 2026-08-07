# Two Sum in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a 1-based indexed integer array  **arr[]**  that is sorted in non-decreasing order, along with an integer  **target**. Your task is to find two elements in the array such that their sum is equal to  **target**. If such a pair exists, return the **indices**  of the two elements in  **increasing order**. If no such pair exists, return **[-1, -1].
Note: **If your answer is correct then the driver code will print "true" otherwise "false".

 **Examples:** 

```
Input: arr[] = [2, 7, 11, 15], target = 9
Output: [1, 2]
Explanation: Since arr[0] + arr[1] = 2 + 7 = 9 equals the target, return their 1-based indices : [1, 2]
```

```
Input: arr[] = [1, 3, 4, 6, 8, 11], target = 10
Output: [3, 4]
Explanation: Since arr[2] + arr[3] = 4 + 6 = 10 equals the target, return their 1-based indices : [3, 4]
```

**Constraints:
**1 ≤ arr.size() ≤ 105
1 ≤ arr[i], target ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-07T08:55:12.742Z  

```java
class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        int left=0;
        int n=arr.length;
        int right=arr.length-1;
        ArrayList<Integer> li=new ArrayList<>();
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                li.add(left+1);
                li.add(right+1);
                return li;
            }
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        
       
            li.add(-1);
            li.add(-1);
        
        return li;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/two-sum-in-sorted-array/1)