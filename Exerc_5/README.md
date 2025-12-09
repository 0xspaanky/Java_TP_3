# Exercise 5: Sliding Window - Distinct Elements

## Description
This exercise implements a sliding window algorithm to count distinct elements in each window of size k in an array.

## What it does
The program:
1. Takes an array of n integers and a window size k as input
2. Uses a sliding window approach to traverse the array
3. For each window of k consecutive elements, counts the number of distinct values
4. Uses a frequency array to efficiently track element counts as the window slides

## Algorithm
- Maintains a frequency array to count occurrences of each element
- Tracks the number of distinct elements in the current window
- When sliding the window: removes the leftmost element and adds a new rightmost element
- Updates the distinct count based on frequency changes

## Input
- n: Size of the array
- k: Size of the sliding window
- Array of n integers

## Output
- Visual representation of each sliding window
- Number of distinct elements in each window
- Final result array showing distinct counts for all windows

## Example
```
Enter size n: 7
Enter window size k: 3
Enter 7 integers: 1 2 1 3 4 3 3

Array: [1 2 1 3 4 3 3]

--- Sliding Windows ---
Window 1: [1 2 1] -> distinct = 2
Window 2: [2 1 3] -> distinct = 3
Window 3: [1 3 4] -> distinct = 3
Window 4: [3 4 3] -> distinct = 2
Window 5: [4 3 3] -> distinct = 2

Result: 2 3 3 2 2
```

## Files
- `matrixRotation.java`: Contains matrix rotation utility (90 degrees clockwise in-place)
- `testMatrixRotation.java`: Main program implementing the sliding window algorithm

Note: Despite the file name mentioning matrix rotation, the main functionality in the test file is the sliding window algorithm for counting distinct elements.
