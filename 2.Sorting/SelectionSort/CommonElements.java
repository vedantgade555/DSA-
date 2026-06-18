package SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;

//Given two integer arrays a[] and b[]. Return the list of elements common
//to both the lists and return the list in sorted order. Duplicates may be
//there in the output list.

public class CommonElements {
	public static void main(String[] args)
	{
		int a[] = {3,4,2,2,4};
		int b[] = {3,2,2,7};
		int i=0,j=0;
		Arrays.sort(a);
		Arrays.sort(b);
		
		ArrayList<Integer> arr  =new ArrayList<Integer>();
		
		
		while(i<a.length && j<b.length)
		{
			if(a[i]==b[j])
			{
				arr.add(a[i]);
				i++;
				j++;
			}
			else if(a[i]>b[j])
			{
				j++;
			}
			else if(a[i]<b[j])
			{
				i++;
			}
		}
		
		for(int num:arr)
		{
			System.out.println(num);
		}		
		
	}

}
