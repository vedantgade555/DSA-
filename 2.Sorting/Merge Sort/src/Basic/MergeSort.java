package Basic;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3};

        mergeSort(arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;

        // Base case
        if (n <= 1) return;

        // Step 1: Create 2 arrays
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step 2: Copy elements
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }

        // Step 3: Recursive calls
        mergeSort(a);
        mergeSort(b);

        // Step 4: Merge
        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0; // a pointer
        int j = 0; // b pointer
        int k = 0; // c pointer

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copy remaining elements of a
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Copy remaining elements of b
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}