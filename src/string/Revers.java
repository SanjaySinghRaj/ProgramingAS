package string;

public class Revers {

	public static void main(String[] args) {
		String s1="JSPIDERS";
		char ch[]=s1.toCharArray();
		String rev="";
		for (int i = 0; i < ch.length; i++) {
			rev=ch[i]+rev;
			
		}
		System.out.println(rev);
	}

}
