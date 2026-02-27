# 🧩 Sudoku Solver (Backtracking Algorithm)

A Java-based Sudoku Solver that automatically solves a 9×9 Sudoku puzzle using the Backtracking algorithm.

This project demonstrates recursion, constraint validation, and algorithmic problem-solving in Java.

## 🚀 Features

- 🔢 Accepts a 9×9 Sudoku grid as input
- 🔄 Uses Backtracking algorithm to explore possible solutions
- ✅ Validates row, column, and 3×3 sub-grid constraints
- 🖥 Displays formatted unsolved and solved grids
- ❌ Detects if no solution exists

## 🛠 Technologies Used

- Java
- Recursion
- Backtracking Algorithm
- 2D Arrays
- Console-based input/output

## 🧠 Algorithm Used

### Backtracking Approach

1. Find an empty cell (represented by 0).
2. Try numbers from 1 to 9.
3. Check if placing the number is valid:
   - Not present in same row
   - Not present in same column
   - Not present in same 3×3 box
4. If valid, place the number and recurse.
5. If it leads to a dead end, backtrack and try another number.
6. Repeat until puzzle is solved.

## 👨‍💻 Author

Keerthan Poojari
