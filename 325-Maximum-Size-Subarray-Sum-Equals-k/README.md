# 325. Maximum Size Subarray Sum Equals k

**Medium**

[Original Page](https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/)

Given an array _nums_ and a target value _k_, find the maximum length of a subarray that sums to `k`. If there isn't one, return 0 instead.

##### Note:
The sum of the entire _nums_ array is guaranteed to fit within the 32-bit signed integer range.

##### Example 1:
```
Input: nums = [1, -1, 5, -2, 3], k = 3
Output: 4 
Explanation: The subarray [1, -1, 5, -2] sums to 3 and is the longest.
```

##### Example 2:
```
Input: nums = [-2, -1, 2, 1], k = 1
Output: 2 
Explanation: The subarray [-1, 2] sums to 1 and is the longest.
```

##### Follow up:
Can you do it in O(_n_) time?
