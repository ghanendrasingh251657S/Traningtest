Question 1: The Missing Seat Number
Topic: Mathematics | Difficulty: Easy
A college is organizing a programming competition. Each participant receives a unique seat number from 0 to n.
However, one seat number is missing from the registration list.
You are given an array containing n distinct numbers from the range 0 to n. Find and return the missing number.
Example 1
Input: nums = [3, 0, 1]
Output: 2
Explanation: The numbers should range from 0 to 3. Since 2 is missing, return 2



Question 2: Find the Best Pair of Students
Topic: Arrays | Difficulty: Easy
During a college event, students collect points by participating in activities. The organizer wants to find two students
whose points add up to a given target.
You are given an integer array scores and an integer target. Return the indices of the two elements whose sum
equals the target. Exactly one valid answer exists, and you cannot use the same element twice.
Example 1
Input: scores = [2, 7, 11, 15]; target = 9
Output: [0, 1]
Explanation: The scores at indices 0 and 1 are 2 and 7. Their sum is 9

Question 3: Find the Second-Highest Score
Topic: Sorting / Arrays | Difficulty: Easy–Medium
After a coding contest, a teacher sorts the students' scores to announce the runner-up. Some students may have the
same score, so the runner-up must have a score strictly lower than the highest score.
Given an integer array scores, return the second-largest distinct value. If a second distinct value does not exist,
return -1.
Example 1
Input: scores = [8, 3, 5, 8, 6]
Output: 6
Explanation: The highest distinct score is 8, and the second-highest distinct score is 6.
Example 2
Input: scores = [4, 4, 4]
Output: -1
Explanation: There is no second distinct score











Question 5: Find the First Repeated Roll Number
Topic: Hashing | Difficulty: Easy
A teacher records the roll numbers of students who submitted their assignments. Due to a mistake, some roll
numbers may have been entered more than once.
You are given an integer array rollNumbers. Return true if any roll number appears at least twice; otherwise,
return false.
Example 1
Input: rollNumbers = [1, 2, 3, 1]
Output: true
Explanation: Roll number 1 appears twice.
Example 2
Input: rollNumbers = [1, 2, 3, 4]
Output: false
Explanation: Every roll number is unique



Question 6: The Best Buy-and-Sell Day
Topic: Array Traversal / Fundamentals | Difficulty: Easy–Medium
A student tracks the price of a study-planner app over several days. The student wants to buy the app at its lowest
price on one day and sell it at a higher price on a later day.
You are given an array prices, where prices[i] is the price on day i. Find the maximum profit possible by buying
on one day and selling on a later day. If no profit is possible, return 0.
Example 1
Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy at price 1 and sell at price 6. The maximum profit is 6 - 1 = 5