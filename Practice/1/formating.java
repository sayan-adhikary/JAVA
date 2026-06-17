class Solution {
    /*
     * Approach :-
     * 
     * 1. Store numbers from 1 to n in a list.
     * 
     * 2. Precompute factorial values:
     * fact[i] = i!
     * 
     * 3. Convert k to 0-based indexing:
     * k = k - 1
     * 
     * 4. For each position from left to right:
     * 
     * - Compute:
     * index = k / fact[i]
     * 
     * - The number at this index is the
     * next digit of the permutation.
     * 
     * - Append the number to the answer.
     * 
     * - Remove the selected number from
     * the list of available numbers.
     * 
     * - Update:
     * k = k % fact[i]
     * 
     * 5. Repeat until all positions are filled.
     * 
     * 6. Return the constructed permutation string.
     * 
     * Time Complexity: O(N²)
     * Space Complexity: O(N)
     */
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            nums.add(i);

        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++)
            fact[i] = fact[i - 1] * i;

        k--;

        StringBuilder ans = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            int index = k / fact[i];
            ans.append(nums.get(index));

            nums.remove(index);

            k %= fact[i];
        }

        return ans.toString();
    }
}