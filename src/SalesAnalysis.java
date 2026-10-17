public class SalesAnalysis {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        double[] salesChange = {12, -8, 15, 18, -22, 10,
                14, -5, 20, 8, -25, 6};
        // call method findBestPeriod
        int[] bestPeriod = findBestPeriod(salesChange);
        // call method calculateTotal
        double bestTotal = calculateTotal(salesChange, bestPeriod[0], bestPeriod[1]);
        printResult(months, bestPeriod, bestTotal);
    } // Close main()
// Method findBestPeriod
    public static int[] findBestPeriod(double[] salesChange) {
        double bestTotal = salesChange[0];
        int bestStart = 0;
        int bestEnd = 0;

        for (int start = 0; start < salesChange.length; start++) {
            double runningTotal = 0;

            for (int end = start; end < salesChange.length; end++) {
                runningTotal += salesChange[end];

                if (runningTotal > bestTotal) {
                    bestTotal = runningTotal;
                    bestStart = start;
                    bestEnd = end;
                }
            }
        }

        int[] bestPeriod = {bestStart, bestEnd};
        return bestPeriod;
    } //Close method bestPeriod

    //Method calculateTotal
    public static double calculateTotal(double[] salesChange, int bestStart, int bestEnd) {
        double total = 0;

        for (int i = bestStart; i <= bestEnd; i++) {
            total += salesChange[i];
        }

        return total;
    }// Close method calculateTotal
    // Method printResult

    public static void printResult(String[] months, int[] bestPeriod, double bestTotal) {
        System.out.println("Sales Analysis");
        System.out.println("-------------------------");
        System.out.println("Start Month: " + months[bestPeriod[0]]);
        System.out.println("End Month: " + months[bestPeriod[1]]);
        System.out.println("Total Sales Change: " + bestTotal + " million");
    }// Close method printResult

} // Close class SalesAnalysis

