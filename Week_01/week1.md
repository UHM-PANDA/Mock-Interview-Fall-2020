
# Week 1: "Start with the Romans"
### September 7 – 11, 2020

#### 1) Decimal to Roman
Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
https://leetcode.com/problems/integer-to-roman/
```
Time: O(k) where k is number of characters in solution
Space: O(k) where k is number of characters in solution
```
```
Input: 3
Output: "III"
```

```
Input: 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```
```
Symbol      Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```
#### 2) Roman to Decimal
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
https://leetcode.com/problems/roman-to-integer/
```
Time: O(n) length of Roman char string
Space: O(1) only one additional int required
```
```
Input: "IV"
Output: 4
```
```
Input: "LVIII"
Output: 58
```
```
Symbol      Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```
#### 3) Optimal Sort Moves
Determine the number of "moves" it would take to sort an int array. Each move is considered the move of ONE int.  For example, A[4] to the 3rd index.  And NOT, "Swap A[4] and A[5]".  
```
Time Complexity: O(nlg(n) + n)
Space Complexity: O(2n)
```
```
Input: [1, 2, 3, 4]
Output: 0
```
```
Input: [2, 5, 3, 11]
Output: 2
```
```
Input: [9, 5, 3, 1]
Output: 4
```
