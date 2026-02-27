import java.util.*;

class Solution {

    public void mergeSortDevider(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;
        mergeSortDevider(arr, low, mid);
        mergeSortDevider(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public int[] mergeSort(int[] nums) {
        int n = nums.length;
        mergeSortDevider(nums, 0, n - 1);
        return nums;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        Solution sol = new Solution();
        int[] sortedArr = sol.mergeSort(arr);

        System.out.println("After Sorting Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(sortedArr[i] + " ");
        System.out.println();
    }
}