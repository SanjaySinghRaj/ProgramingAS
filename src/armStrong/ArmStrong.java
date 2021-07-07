package armStrong;
import java.util.Scanner;
public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the starting number");
		int i=sc.nextInt();
		System.out.println("Enter the Ending number");
		int j=sc.nextInt();
		int sum1=0,count1=0;
		while(i<=j) {
			int temp=i;
			int count=0;
			while(temp>0) {
				count++;
				temp=temp/10;
			}
			temp=i;
			int sum=0;
			while(temp>0) {
				int digit = temp%10;
				int prod=1,p=count;
				while(p>0) {
					prod=prod*digit;					
					p--;
				}
				sum=sum+prod;
				temp=temp/10;			
			}
			if(sum==i) {
				System.out.println("It's Arm Strong Number " +i);
				sum1=sum1+i;
				count1++;
			}
			
			i++;
		}
		System.out.println("Sum Of Arm Strong Number"+sum1);
		System.out.println("Total Arm Strong Number"+count1);
		
		
	}

}
