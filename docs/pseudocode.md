
# Sales Analysis - Pseudocode

## 1. Main Program

1. Start the program.
2. Create an array for the 12 month names.
3. Create another array for the monthly sales changes.
4. Call findBestPeriod to find the best period.
5. Call printResult to display the result.
6. End the program.

## 2. Find Best Period

1. Set bestTotal to the first sales change.
2. Set bestStart and bestEnd to 0.
3. Choose a starting month using the outer loop.
4. Set runningTotal to 0.
5. Use the inner loop to check each ending month, starting from the current starting month.
6. Add the current sales change to runningTotal.
7. If runningTotal is greater than bestTotal:
   - Update bestTotal with runningTotal.
   - Save the starting position in bestStart.
   - Save the ending position in bestEnd.
8. Repeat steps 5 to 7 until the inner loop finishes.
9. Repeat steps 3 to 8 for every starting month.
10. If two periods have the same maximum total, keep the first one.
11. Make the best total and positions available to the main program.

## 3. Print Result

1. Use bestStart to find the starting month in the months array.
2. Use bestEnd to find the ending month in the months array.
3. Display the starting month.
4. Display the ending month.
5. Display bestTotal in millions of dollars.
