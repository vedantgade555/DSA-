package Basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;

        System.out.println(search(arr, target));
    }

    public static int helper(int[] arr, int target, int lo, int hi) {
        if (lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return helper(arr, target, lo, mid - 1);
        else
            return helper(arr, target, mid + 1, hi);
    }

    public static int search(int[] arr, int target) {
        return helper(arr, target, 0, arr.length - 1);
    }
}