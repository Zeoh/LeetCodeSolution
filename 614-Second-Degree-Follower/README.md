# 614. Second Degree Follower

**Medium**

[Original Page](https://leetcode.com/problems/second-degree-follower/)

SQL Schema >
```
Create table If Not Exists follow (followee varchar(255), follower varchar(255))
Truncate table follow
insert into follow (followee, follower) values ('A', 'B')
insert into follow (followee, follower) values ('B', 'C')
insert into follow (followee, follower) values ('B', 'D')
insert into follow (followee, follower) values ('D', 'E')
```

In facebook, there is a `follow` table with two columns: __followee__, __follower__.

Please write a sql query to get the amount of each follower’s follower if he/she has one.

For example:

```
+-------------+------------+
| followee    | follower   |
+-------------+------------+
|     A       |     B      |
|     B       |     C      |
|     B       |     D      |
|     D       |     E      |
+-------------+------------+
```

should output:
```
+-------------+------------+
| follower    | num        |
+-------------+------------+
|     B       |  2         |
|     D       |  1         |
+-------------+------------+
```

##### Explanation:
Both B and D exist in the follower list, when as a followee, B's follower is C and D, and D's follower is E. A does not exist in follower list.

##### Note:
Followee would not follow himself/herself in all cases.
Please display the result in follower's alphabet order.
