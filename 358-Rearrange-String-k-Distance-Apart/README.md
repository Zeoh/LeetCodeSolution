# 358. Rearrange String k Distance Apart

**Hard**

[Original Page](https://leetcode.com/problems/rearrange-string-k-distance-apart/)

Given a non-empty string __s__ and an integer __k__, rearrange the string such that the same characters are at least distance __k__ from each other.

All input strings are given in lowercase letters. If it is not possible to rearrange the string, return an empty string `""`.

##### Example 1:
```
Input: s = "aabbcc", k = 3
Output: "abcabc" 
Explanation: The same letters are at least distance 3 from each other.
```

##### Example 2:
```
Input: s = "aaabc", k = 3
Output: "" 
Explanation: It is not possible to rearrange the string.
```

##### Example 3:
```
Input: s = "aaadbbcc", k = 2
Output: "abacabcd"
Explanation: The same letters are at least distance 2 from each other.
```
