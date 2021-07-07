package string;

public class PrintNum {

	public static void main(String[] args) {
		String s1="AJ8880088@gmail.com";
		char ch[]=s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9')
			{
				System.out.println(ch[i]);
			}
				
			
			
			
		}
		
	
	}

}
