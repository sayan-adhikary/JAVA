class Solution {
    /*
     * Approach :-
     * 
     * 1. Initialize:
     * - ones = 0 to count the current streak of 1's.
     * - max = 0 to store the maximum streak found.
     * 
     * 2. Traverse the array element by element.
     * 
     * 3. If the current element is 1:
     * - Increment ones.
     * - Update max if the current streak is larger.
     * 
     * 4. If the current element is 0:
     * - Reset ones to 0 since the streak breaks.
     * 
     * 5. Continue until all elements are processed.
     * 
     * 6. Return max as the maximum number of
     * consecutive 1's.
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int ones = 0;
        for (int ele : nums) {
            if (ele == 1) {
                ones++;
                max = Math.max(max, ones);
            } else {
                ones = 0;
            }
        }
        return max;
    }
}