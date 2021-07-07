package string;

public class Palindrome {

	public static void main(String[] args) {
		String s1="MalayalaM";
		System.out.println(palind(s1));
		

	}
	public static boolean palind(String pal) {
		
		char ch[]=pal.toCharArray();
		String rev="";
		for (int i = 0; i < ch.length; i++) {
			rev=ch[i]+rev;
		}
		if(pal.equals(rev)) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

}
