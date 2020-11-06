# Week 8: “Recursion Pt2 Electric Boogaloo”

#### 1) Knapsack
Given the weights and values of n items and a capacity W of a sack. Find the maximum value of items to put in the sack without going over capacity.
```
input:
       capacity: 50
       value: [60, 100, 120],
       weight: [10, 20, 30],


output: 220
```
#### 2) Rod Cutting
Given a rod of n inches and an array of prices of pieces of size smaller than n. Determine the maximum value obtainable by cutting the rod and selling it.

```
input:
    length: 8,
    price:  [1, 5, 8, 9, 10, 17, 17, 20]

output: 22
```
#### 3) Sudoku Solver
Given an unfinished sudoku puzzle, output a correctly solved sudoku puzzle.
```
Input: [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]

Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
```
