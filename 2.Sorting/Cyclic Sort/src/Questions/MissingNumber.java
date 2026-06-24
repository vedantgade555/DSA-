package Questions;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};

        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {

        int n = arr.length + 1; // numbers are from 1 to n

        int i = 0;

        while (i < arr.length) {

            if (arr[i] == i + 1 || arr[i] == n) {
                i++;
            } else {
                int idx = arr[i] - 1;
                swap(arr, i, idx);
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n;
    }

    public static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}