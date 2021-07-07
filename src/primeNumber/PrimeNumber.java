package primeNumber;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Start Value  ");
		int i=sc.nextInt();
		System.out.print("Enter The End Value  ");
		int j=sc.nextInt();
		int count=0,sum=0;
		
		while(i<=j) {
			int num=2;
			while (num<=i) {
				if(i%num==0) {
					break;
				}
				num++;
				
			}
			
			if(num==i) {
				System.out.println("It's Prime Number "+i);
				sum=sum+i;
				count++;
			}
			
			i++;
			
		}
		System.out.println("Total Sum of Prime Number "+sum);
		System.out.println("Total Count of Prime Number "+count);
		
		
		

	}

}
