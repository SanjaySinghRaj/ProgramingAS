package array;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int key=6;
		Arrays.sort(a);
		int lo=0;
		int hi=a.length-1;
		int min=(lo+hi)/2;
		while(lo<=hi) {
			if(a[min]==key) {
				System.out.println(key+ " Index Is "+min);
				break;
			}
			else if(a[min]<key)
				{
				lo=min+1;
				}
			else {
				hi=min-1;
			}
			min=(lo+hi)/2;
		}
		if(lo>hi)
		{
			System.out.println("Eelment not Found");
		}
		
		
	}

}
