package array;

import java.util.Scanner;
public class EvenNumArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Array Index "+i+"th Value ");
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
