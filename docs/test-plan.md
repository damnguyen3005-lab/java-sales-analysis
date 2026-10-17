
# Sales Analysis - Test Plan

## Purpose

I tested my program with different salesChange arrays to make sure it finds the correct consecutive months with the largest total sales change.

## Test 1: Original Data

Input: `{12, -8, 15, 18, -22, 10, 14, -5, 20, 8, -25, 6}`

Expected: Jan to Oct, 62 million

Actual: Jan to Oct, 62 million

Result: PASS

## Test 2: All Negative Values

Input: `{-12, -8, -15, -18, -22, -10, -14, -5, -20, -8, -25, -6}`

Expected: Aug to Aug, -5 million

Actual: Aug to Aug, -5 million

Result: PASS

## Test 3: Equal Maximum Totals

Input: `{5, -10, 5, -10}`

Expected: Jan to Jan, 5 million

Actual: Jan to Jan, 5 million

Result: PASS

## Test 4: Best Period at the End

Input: `{-10, -5, 8, 7}`

Expected: Mar to Apr, 15 million

Actual: Mar to Apr, 15 million

Result: PASS

## Test 5: Best Period at the Beginning

Input: `{10, 5, -20, -8}`

Expected: Jan to Feb, 15 million

Actual: Jan to Feb, 15 million

Result: PASS

## Test 6: Best Period Is One Month

Input: `{-5, 12, -20, 3}`

Expected: Feb to Feb, 12 million

Actual: Feb to Feb, 12 million

Result: PASS

## Conclusion

All six tests passed. The program found the correct starting month, ending month, and total sales change. It also worked with negative values, equal totals, and periods at the beginning or end of the array.

After testing, I changed the arrays back to the original 12-month data.
