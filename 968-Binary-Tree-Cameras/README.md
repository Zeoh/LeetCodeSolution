# 968. Binary Tree Cameras

**Hard**

[Original Page](https://leetcode.com/problems/binary-tree-cameras/)

Given a binary tree, we install cameras on the nodes of the tree. 

Each camera at a node can monitor __its parent, itself, and its immediate children__.

Calculate the minimum number of cameras needed to monitor all nodes of the tree.

##### Example 1:
![](https://assets.leetcode.com/uploads/2018/12/29/bst_cameras_01.png)
```
Input: [0,0,null,0,0]
Output: 1
Explanation: One camera is enough to monitor all nodes if placed as shown.
```

##### Example 2:
![](https://assets.leetcode.com/uploads/2018/12/29/bst_cameras_02.png)
```
Input: [0,0,null,0,null,0,null,null,0]
Output: 2
Explanation: At least two cameras are needed to monitor all nodes of the tree. The above image shows one of the valid configurations of camera placement.
```

##### Note:
1. The number of nodes in the given tree will be in the range `[1, 1000]`.
2. __Every__ node has value 0.
