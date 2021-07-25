package july20;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		SBI s1=new SBI();
		BankOfIndia b1 = new BankOfIndia();
		HDFC h1 = new HDFC();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for SBI");
		System.out.println("Enter 2 for BankOfIndia");
		System.out.println("Enter 3 for HDFC");
		int num=sc1.nextInt();
		if(num==1) {
			System.out.println("SBI = "+s1.getInterest());
		}
		else if (num==2) {
			System.out.println("BankOfIndia = "+b1.getInterest());
		}
		else if (num==3) {
			System.out.println("HDFC = "+h1.getInterest());
		}
		else {
			System.out.println("Plese Enter right Input ");
		}
		
		
		
	
		
	}

}
