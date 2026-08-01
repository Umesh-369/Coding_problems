# Symmetric Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree,  *check whether it is a mirror of itself*  (i.e., symmetric around its center).

 

 **Example 1:** 

```
Input: root = [1,2,2,3,4,4,3]
Output: true

```

 **Example 2:** 

```
Input: root = [1,2,2,null,3,null,3]
Output: false

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 1000].
- -100 <= Node.val <= 100

 

 **Follow up:**  Could you solve it both recursively and iteratively?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.4 MB (beats 71.14%)  
**Submitted:** 2026-08-01T09:17:10.151Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
       return root==null || dfs(root.left,root.right);
    }

    public boolean dfs(TreeNode left,TreeNode right){
       if(left==null || right==null){
          return left==right;
       }

        if(left.val != right.val){
            return false;
        }
     
      return dfs(left.left,right.right)&& dfs(left.right,right.left);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/symmetric-tree/)