package string;

public class PrintChar {

	public static void main(String[] args) {
		String s1="AJ8880088@gmail.com";
		char ch[]=s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z'||ch[i]>='a' && ch[i]<='z')
			{
				System.out.println(ch[i]);
			}
		}

	}

}
