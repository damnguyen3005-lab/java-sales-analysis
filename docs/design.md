# Sales Analysis – Design

## 1. Problem Description

This program is for a computer company. The company wants to find the consecutive months with the highest total sales change.

The program uses the sales changes for 12 months. Some numbers are positive and some are negative. The numbers are in millions of dollars.

The program will find the best period and show the starting month, ending month, and highest total sales change.

## 2. Data Design

I will use two arrays.

The first array, `months`, stores the month names.

The second array, `salesChange`, stores the sales changes for each month.

The two arrays use the same index. For example, `months[0]` is Jan and `salesChange[0]` is the sales change for Jan.

I will use these variables:

- `start` and `end` to check different periods.
- `runningTotal` to add the sales changes for the current period.
- `bestTotal` to save the highest total.
- `bestStart` and `bestEnd` to save the positions of the best period.

I will start `bestTotal` with the first sales value. This also works if all the numbers are negative.

I will use two loops to check the consecutive months. When I start a new period, I will set `runningTotal` to 0.

If `runningTotal` is greater than `bestTotal`, I will update the best total and its starting and ending positions.

If two periods have the same total, I will keep the first one. I will use `>` instead of `>=`.

## 3. Program Organization

I plan to use three methods.

**`main()`**

This method creates the arrays and calls the other methods.

**`findBestPeriod()`**

This method uses nested loops to calculate the sales changes for different periods. It finds the highest total and saves the starting and ending positions.

**`printResult()`**

This method prints the starting month, ending month, and highest total sales change.

## 4. Program Flow

1. Start the program.
2. Create the two arrays.
3. Set the first sales value as `bestTotal`.
4. Use the outer loop to choose the starting month.
5. Set `runningTotal` to 0.
6. Use the inner loop to add the sales changes for consecutive months.
7. Compare `runningTotal` with `bestTotal`.
8. If the new total is greater, update `bestTotal`, `bestStart`, and `bestEnd`.
9. Repeat until all periods are checked.
10. Print the starting month, ending month, and highest total.
11. End the program.
