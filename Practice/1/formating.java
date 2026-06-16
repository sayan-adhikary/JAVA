class Solution {
    /*
     * Approach :-
     * 
     * 1. Sort the array so that duplicate
     * elements become adjacent.
     * 
     * 2. Use recursion to generate subsets.
     * 
     * 3. At each index, make two choices:
     * 
     * Include:
     * - Add nums[ind] to the current subset.
     * - Recurse for the next index.
     * - Backtrack by removing the element.
     * 
     * Exclude:
     * - Skip all consecutive duplicate
     * occurrences of nums[ind].
     * - Recurse from the first different
     * element.
     * 
     * 4. When the recursion reaches the end
     * of the array:
     * - Add the current subset to the answer.
     * 
     * 5. Continue until all possible choices
     * have been explored.
     * 
     * Time Complexity: O(N × 2^N)
     * Space Complexity: O(N)
     */
    private void func(int ind, List<Integer> arr, int[] nums, List<List<Integer>> ans) {
        if (ind == nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        arr.add(nums[ind]);
        func(ind + 1, arr, nums, ans);
        arr.remove(arr.size() - 1);

        for (int j = ind + 1; j < nums.length; j++) {
            if (nums[j] != nums[ind]) {
                func(j, arr, nums, ans);
                return;
            }
        }

        func(nums.length, arr, nums, ans);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        func(0, arr, nums, ans);
        return ans;
    }
};
