package BubbleSort;

public class PushingZeroToLast {

	
	public static void main(String[] args) {
		
		int arr[] = {1,2,0,5,4,0,6,0,7,0,9,4,0};
		int n= arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]==0)
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		BubbleSortDemo.print(arr);
	}

}
