# Week 4: “Recursion”
### September 28 – October 2, 2020

#### 1) DP Fibonacci
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1.
https://leetcode.com/problems/fibonacci-number/
```
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
```
```
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
```
```
Recursive:
     Time: O(2^n)
     Space: O(n)
Iterative Array:
     Time: O(n)
     Extra: O(n)
Iterative Variable:
     Time: O(n)
     Extra: O(1)
Mathematical:
     Time: O(1)
     Extra: O(1)
```
#### 2) Tower of Hanoi
A peg contains rings in sorted order, with the largest ring being the lowest.  You are to transfer these rings to another peg, which is intially empty.  You have a third peg, which is also initially empty.  The only operation you can perform is taking a single ring from the top of one peg and placing it on top of another peg.  You cannot place a larger ring above a smaller one.  Write a function which, given n (which represents the number of rings at the initial peg), return the number of steps it would take to move all the rings from the initial peg to the destination peg.
```
Input: n = 3
Output: 7
0th to 1st -> 0th to 2nd -> 1st to 2nd -> 0th to 1st -> 2nd to 0th -> 2nd to 1st -> 0th to 1st
```


#### 3) Spiral Matrix - Recursive
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
https://leetcode.com/problems/spiral-matrix/
```
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
```
```
Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
```
```
Time Complexity: O(m * n)
Space Complexity: O(m * n)
```
