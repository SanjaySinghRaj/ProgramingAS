package array;

public class ArrayVowels {

	public static void main(String[] args) {
		char ch[]= {'a','b','c','d','e','f','g'};
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				System.out.println(ch[i]);
			}
		}

	}

}
