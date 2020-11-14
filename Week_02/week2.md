# Week 2: “Think outside the box"

#### 1) Count Bits
Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).
https://leetcode.com/problems/number-of-1-bits/
Elements of Programing Interviews: 4.1 Computing the parity of a Word
```
Input: 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
```
```
Input: 00000000000000000000000010000000
Output: 1
Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
```
```
Input: 00000000000000000000000010000000
Output: 1
Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
```
```
Time Complexity:
Basic Solution: O(n) checks each bits
Advanced Solution: O(k) where k is number of bits set to 1
Space Complexity: O(1) for both
```

#### 2) Swap Bits
Write a function that swaps the ith and jth bit of a given long.
Elements of Programing Interviews: 4.2 Swap Bits
```
Input: 100000
Input: 1
Input: 6
Output: 000001
```
```
Input: 1111
Input: 1
Input: 4
Output: 1111
```
```
Time Complexity: O(1)
Space Complexity: O(1)
```
#### 3) Compute power pow(x,y) => x^y
Given a double x and int y, return x^y as a double.
Elements of Programing Interviews: 4.2 Swap Bits
```
Input: 2.00000, 10
Output: 1024.00000
```
```
Input: 2.10000, 3
Output: 9.26100
```
```
Input: 2.00000, -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
```
```
Time Complexity: O(2^n)
Space Complexity: O(1)
```
