import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length, maxLen = Integer.MAX_VALUE, left = 0, right = 0;

        // To store the sum of elements in the window
        int sum = nums[0];

        // Traverse all the elements
        while (right < n) {

            // If the sum exceeds K, shrink the window
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            // Store the maximum length
            if (sum == k) {
                maxLen = Math.min(maxLen, right - left + 1);
            }

            right++;
            if (right < n)
                sum += nums[right];
        }

        return maxLen;
    }
}

class Main {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int k = 7;

        // Creating an object of Solution class
        Solution sol = new Solution();

        /*
         * Function call to find the length
         * of longest subarray having sum k
         */
        int ans = sol.longestSubarray(nums, k);

        System.out.println("The length of longest subarray having sum k is: " + ans);
    }
}
