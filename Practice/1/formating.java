class Solution {
    /*
     * Approach :-
     * 
     * 1. Sort the array in ascending order.
     * 
     * 2. Iterate through the array and fix one element
     * at a time as the first element of the triplet.
     * 
     * 3. Skip duplicate fixed elements to avoid
     * generating duplicate triplets.
     * 
     * 4. Initialize two pointers:
     * - j = i + 1
     * - k = n - 1
     * 
     * 5. Calculate:
     * sum = nums[i] + nums[j] + nums[k]
     * 
     * 6. If sum < 0:
     * - Increase j to get a larger sum.
     * 
     * 7. If sum > 0:
     * - Decrease k to get a smaller sum.
     * 
     * 8. If sum == 0:
     * - Store the triplet.
     * - Move both pointers inward.
     * - Skip duplicate values for j and k.
     * 
     * 9. Continue until j >= k.
     * 
     * 10. Return the list of all unique triplets.
     * 
     * Time Complexity: O(N²)
     * Space Complexity: O(1)
     */

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);

                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                }
            }
        }

        return ans;
    }
}