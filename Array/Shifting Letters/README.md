# 848. Shifting Letters

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/shifting-letters/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=flat-square)

## Problem Statement

You are given a string s of lowercase English letters and an integer array shifts of the same length.

Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').


	For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.


Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.

Return the final string after all such shifts to s are applied.

 
Example 1:

Input: s = "abc", shifts = [3,5,9]
Output: "rpl"
Explanation: We start with "abc".
After shifting the first 1 letters of s by 3, we have "dbc".
After shifting the first 2 letters of s by 5, we have "igc".
After shifting the first 3 letters of s by 9, we have "rpl", the answer.


Example 2:

Input: s = "aaa", shifts = [1,2,3]
Output: "gfd"


 
Constraints:


	1 <= s.length <= 105
	s consists of lowercase English letters.
	shifts.length == s.length
	0 <= shifts[i] <= 109

## Examples

```
Input: s = "abc", shifts = [3,5,9]
Output: "rpl"
Explanation: We start with "abc".
After shifting the first 1 letters of s by 3, we have "dbc".
After shifting the first 2 letters of s by 5, we have "igc".
After shifting the first 3 letters of s by 9, we have "rpl", the answer.

Input: s = "aaa", shifts = [1,2,3]
Output: "gfd"
```

## Constraints

- For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.

---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*