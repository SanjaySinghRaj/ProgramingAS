package primeNumber;

import java.util.Scanner;

public class PrimePalindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		
			int num=2;
			while(num<=i) {
				if(i%num==0){
                 break;
              }num++;
			}
			if(i==num){
				
				int temp=i;
			    int rev=0;
			     while(temp!=0) {
				  int digit= temp%10;
				rev=rev*10+digit;
				temp=temp/10;			
			}
			if(rev==i) {
				System.out.println("It's Prime and palondrome Number " +i);
				
			}}
else{
	System.out.println("It's not Prime and palondrome  Number " +i);
}
}

}


