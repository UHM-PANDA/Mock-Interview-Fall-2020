# Week 9: “Arranging Arrays”

#### 1) Delete duplicates
Given a sorted array, delete all duplicates in the array.
```
input: [1,1,2,2,3,4,5,5,6]
output: [1,2,3,4,5,6]
```
#### 2) Pascal's Triangle
Given a target height, compute Pascals Triangle to the target height. The output is a multi-dimensional array, where each sub-array represents a level in the triangle.
```
Pascals Triangle
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1

input: 4
output: [[1],[1,1],[1,2,1],[1,3,3,1]]

```
#### 3) Test Collatz Conjecture
Collatz Conjecture: take any natural number, if it is odd, triple it and add 1, if even, halve it. Repeat the process indefinitely and no matter what number, the sequence will always end with 1.
Given an long n, test the Collatz Conjecture for the first n integers. If all the integers pass the Collatz Conjecture, return true. Otherwise return false.

```
Example sequence: 11 -> 11,34,17,52,26,13,40,20,10,5,16,8,4,2,1

input: 3
output: true

```
