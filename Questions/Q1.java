package Questions;
// Check array i ssorted or not
public class Q1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		
		boolean flag;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				flag= false;
			}
		}
		flag= true;
		
		if(flag) {
			System.out.println("Sorted");
		}else {
			System.out.println("Not Sorted");
		}

	}

}
