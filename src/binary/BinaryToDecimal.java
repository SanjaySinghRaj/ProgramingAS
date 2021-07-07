package binary;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Binary Value");
		int bin =sc.nextInt();
		int count=0,sum=0;
		while(bin!=0) {
			int digit = bin%10;
			sum=sum+digit*pro(2,count);
			count++;
			bin=bin/10;
		}
		
		System.out.println(sum);
		

	}
	public static int pro(int num,int pw)
	{
		int prod=1;
		while(pw!=0)
		{
			prod=prod*num;
			pw--;
		}
		return prod;
	}

}
