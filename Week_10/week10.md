# Week 10: “Mathy”

#### 1) Even Odd Sum
Check if a sum of sequence of consecutive n integers is even or odd or neither. The sequence can start from any number on the real integer line. Return 1 for even, return 0 for odd, return -1 for neither.
```
input: 2
output: 0

input: 4
ouput: 1

input: 5
output: -1
```

#### 2) Binary Leaves List
Form a singly linked list from the leaves (bottom nodes) of a binary tree.  
```
Input:   2
        / \
       1   3

return: ->1->3->/
```
#### 3) xICPC Stamp Problem
What is the smallest postage value which cannot be placed on an envelope, if the latter can hold only a limited number of stamps, and these may only have certain specified face values.

Input: 	x (int, maximum amount of stamps on an envelope)
		val[] (array of ints representing different stamp values)
		
Output:	min (min value that cannot be on the card at once)

```
Input: 	x = 3
		val[] = (1, 2, 5, 20)
		
	1: 1
	2: 2
	3: 1, 2
	4: 2, 2
	5: 5
	6: 1, 5
	7: 2, 5
	8: 1, 2, 5
	9: 2, 2, 5
	10: 5, 5
	11: 1, 5, 5
	12: 2, 5, 5
	13: cannot
	
Output:	13
```
