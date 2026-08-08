# Kadane's Algorithm

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array  **arr[].**  You need to find the maximum sum of a subarray (containing at least one element) in the array  **arr[]**.

 **Examples:** 

```
Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

```

```
Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.
```

```
Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.
```

**Constraints:
**1 ≤ arr.size() ≤ 105
-104 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-08T04:49:48.782Z  

```java
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1)