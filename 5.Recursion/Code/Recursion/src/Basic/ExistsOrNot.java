package Basic;

public class ExistsOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key=2;
        System.out.println(exists(arr,key,0));
    }
    public static boolean exists(int[] arr,int key,int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==key) return true;
        return exists(arr,key,idx+1);

    }
}
