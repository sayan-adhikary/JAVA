import java.util.ArrayList;

class Solution {
    public int[] mergeSort(int[] nums) {
        int n = nums.length;
        mergeDevide(nums, 0, n - 1);
        return nums;
    }

    public static void mergeDevide(int[] arr, int low, int high) {
        int mid = (low + high) / 2;

        // base case
        if (low >= high) {
            return;
        }

        mergeDevide(arr, low, mid);
        mergeDevide(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> AL = new ArrayList<>();
        int right = mid + 1;

        while (low <= mid && right <= high) {
            if (arr[low] <= arr[right]) {
                AL.add(arr[low]);
                low++;
            } else {
                AL.add(arr[right]);
                right++;
            }
        }
        while (low <= mid) { // [7, 4, 1, 5, 3] => [7, 4, 1], [5, 3]
            AL.add(arr[low]);
            low++;
        }
        while (right <= high) {
            AL.add(arr[right]);
            right++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 7, 4, 1, 5, 3 };
        int[] sorted = mergeSort(nums);
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
