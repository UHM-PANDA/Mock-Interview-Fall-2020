# Week 3: ”Know your boundaries”
### September 21 – 25, 2020

#### 1) Remove Kth last element from LL
Given a linked list, remove the k-th node from the end of list and return its head.
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
Elements of Programming Interviews: 7.7 Remove Kth last element from LL
```
Given linked list: 1->2->3->4->5, and n = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.
```
```
Time Complexity:
     O(n) where n is length of list
     SUBOPTIMAL: O(n + k) where n is length of list
Space Complexity:
     O(1)
```
#### 2) Merge 2 sorted LL
Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
https://leetcode.com/problems/merge-two-sorted-lists/
Elements of Programming Interviews: 7.1 Merge Two Linked Lists
** The basic idea to append then sort list is bad idea.  O((n + m)log(n + m))
```
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
```
```
Time Complexity: O(n + m) where n and m are the lengths of the list
Space Complexity: O(1)
```
#### 3) Spiral Matrix - Iterative
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
Time Complexity: O(m) where m is the length of shorter list 
Space Complexity: O(m * n)
```
