import java.util.*;

class Solution {
    public static int sumHighestAndLowestFrequency(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int s = nums[i];
            mpp.put(s, mpp.getOrDefault(s, 0) + 1);
        }

        int highK = 0, highF = 0, lowK = 0, lowF = nums.length;
        for (int valueF : mpp.values()) {
            highK = Math.max(highK, valueF);
            lowF = Math.min(lowF, valueF);

        }
        return highK + lowF;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3 };
        System.out.println(sumHighestAndLowestFrequency(arr));
    }
}
