package august10;

import java.util.ArrayList;

public class DriveClass {

	public static void main(String[] args) {
		Students s1 = new Students("ajay", 55, 100, 16);
		Students s2 = new Students("ram",55, 100, 16);
		Students s3 = new Students("SHyam", 55, 100, 16);
		Students s4 = new Students("Mohan",55, 100, 16);
		Students s5 = new Students("Sohan",55, 100, 16);
		Students s6 = new Students("Raguv",55, 100, 16);
		
		ArrayList<Students> a1=new ArrayList<Students>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		a1.add(s6);
		for (Students sd : a1) {
			System.out.println(sd);
		}

	}

}
