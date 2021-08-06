package August06;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Wlecome To Sbi Bank");
		System.out.println("Insert your card");
		
		int pin = 1234;
		int bal = 10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Pin Code");
		int pinCode= sc.nextInt();
		try {if (pin == pinCode) {
			System.out.println("Enter your Amount");
			int amot=sc.nextInt();
			if(amot>0 && amot<=15000 && amot<=bal) {
				System.out.println("Wait Atm count your money");
				Thread.sleep(5000);
				System.out.println("Collect your money");
			}
			else {
				throw new WithdrawalException();
			}
		}
		else {
			throw new PinCodeException();
		}}
		finally {
			Thread.sleep(5000);
			System.out.println("Tack your Card");
		}

	}

}
