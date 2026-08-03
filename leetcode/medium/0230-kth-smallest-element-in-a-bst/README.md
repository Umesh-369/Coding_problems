# Kth Smallest Element in a BST

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary search tree, and an integer `k`, return  *the*  `kth`  *smallest value (**1-indexed**) of all the values of the nodes in the tree*.

 

 **Example 1:** 

```
Input: root = [3,1,4,null,2], k = 1
Output: 1

```

 **Example 2:** 

```
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3

```

 

 **Constraints:** 

- The number of nodes in the tree is n.
- 1 <= k <= n <= 104
- 0 <= Node.val <= 104

 

 **Follow up:**  If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46.8 MB (beats 33.40%)  
**Submitted:** 2026-08-03T15:55:00.845Z  

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
    private int count=0;
    private int result=0;

    public void inorder(TreeNode node,int k){
          if(node==null){
            return;
          }

          inorder(node.left,k);
          count++;
          if(count==k){
            result=node.val;
            return;
          }

          if(count<k){
            inorder(node.right,k);
          }
    }

    public int kthSmallest(TreeNode root, int k) {
      inorder(root,k);
      return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)