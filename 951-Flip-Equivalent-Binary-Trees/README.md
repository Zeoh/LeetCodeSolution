# 951. Flip Equivalent Binary Trees

**Medium**

[Original Page](https://leetcode.com/problems/flip-equivalent-binary-trees/)

For a binary tree T, we can define a flip operation as follows: choose any node, and swap the left and right child subtrees.

A binary tree X is _flip_ equivalent to a binary tree Y if and only if we can make X equal to Y after some number of flip operations.

Write a function that determines whether two binary trees are _flip_ equivalent.  The trees are given by root nodes `root1` and `root2`.

##### Example:
```
Input: root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
Output: true
Explanation: We flipped at nodes with values 1, 3, and 5.
```
![](https://assets.leetcode.com/uploads/2018/11/29/tree_ex.png)

##### Note:
1. Each tree will have at most `100` nodes.
2. Each value in each tree will be a unique integer in the range `[0, 99]`.
