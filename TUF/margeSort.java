class Solution {
    public int[] mergeSort(int[] nums) {
        /*
        [7, 4, 1, 5, 3]
        [1, 3, 4, 5, 7]
        */
    }
    public void margeDevide(int[] arr, low, high){
        int low = 0, high = arr.length;
        int mid = (low + hight)/2;

        // base case
        if(low == high)
        margeDevide(int[] arr, low, mid);
        margeDevide(int arr[], mid + 1, high);

    }
}
