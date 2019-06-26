# 456. 132 Pattern

**Medium**

[Original Page](https://leetcode.com/problems/132-pattern/)

Given a sequence of n integers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>, a 132 pattern is a subsequence a<sub>__i__</sub>, a<sub>__j__</sub>, a<sub>__k__</sub> such that __i__ < __j__ < __k__ and a<sub>__i__</sub> < a<sub>__k__</sub> < a<sub>__j__</sub>. Design an algorithm that takes a list of n numbers as input and checks whether there is a 132 pattern in the list.

__Note:__ n will be less than 15,000.

##### Example 1:
```
Input: [1, 2, 3, 4]

Output: False

Explanation: There is no 132 pattern in the sequence.
```

##### Example 2: 
```
Input: [3, 1, 4, 2]

Output: True

Explanation: There is a 132 pattern in the sequence: [1, 4, 2].
```

##### Example 3:
```
Input: [-1, 3, 2, 0]

Output: True

Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
```