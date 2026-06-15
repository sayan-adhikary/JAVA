class Solution {
    /*
     * Approach :-
     * 
     * 1. Calculate the value-to-weight ratio
     * for every item.
     * 
     * 2. Store:
     * [ratio, index]
     * for each item.
     * 
     * 3. Sort all items in descending order
     * of their value-to-weight ratio.
     * 
     * 4. Initialize:
     * totalValue = 0
     * 
     * 5. Traverse the sorted items.
     * 
     * 6. If the current item completely fits
     * into the remaining capacity:
     * - Take the entire item.
     * - Add its full value.
     * - Reduce the remaining capacity.
     * 
     * 7. Otherwise:
     * - Take only the fraction that fits.
     * - Add proportional value:
     * value * (remainingCapacity / weight)
     * - Stop processing.
     * 
     * 8. Return the maximum value obtained.
     * 
     * Time Complexity: O(N log N)
     * Space Complexity: O(N)
     */
    public double fractionalKnapsack(int[] val, int[] wt, long cap) {
        int n = val.length;

        double[][] ratio = new double[n][2];
        for (int i = 0; i < n; i++)
            ratio[i] = new double[] { (double) val[i] / wt[i], i };

        Arrays.sort(ratio, (a, b) -> Double.compare(b[0], a[0]));

        double totalValue = 0.0;
        for (double[] r : ratio) {
            int i = (int) r[1];
            if (wt[i] <= cap) {
                totalValue += val[i];
                cap -= wt[i];
            } else {
                totalValue += val[i] * ((double) cap / wt[i]);
                break;
            }
        }

        return Math.round(totalValue * 1e6) / 1e6;
    }
}