package Basic;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        recPrint(arr,0);
        revPrint(arr,0);

    }
    public static void recPrint(int[] arr,int idx)
    {
        if(idx==arr.length) return;
        System.out.println(arr[idx]);
        recPrint(arr,idx+1);
    }
// add a call bdfore function
    public static void revPrint(int[] arr,int idx)
    {
        if(idx==arr.length) return;
        recPrint(arr,idx+1);
        System.out.println(arr[idx]+" ");
    }
}
