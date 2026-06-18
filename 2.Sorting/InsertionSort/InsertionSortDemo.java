package InsertionSort;

public class InsertionSortDemo {
	public static void print(int[] arr)
	{
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {5,-2,6,7,2,0,7,2};
		print(arr);
		
		for(int i=1;i<arr.length;i++)
		{
			int j=i;
			
			while(j>0 && arr[j]<arr[j-1])
			{
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
		
		print(arr);

	}

}
