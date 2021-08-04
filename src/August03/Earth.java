package August03;

public class Earth {
	int a;
	
	
	public Earth(int a) {
		
		this.a = a;
	}
	public boolean equals(Object obj) {
		Earth temp=(Earth)obj;
		return (this.a==temp.a);
	}


	public static void main(String[] args) {
		
		Earth s1 = new Earth(10); 
		Earth s2 = new Earth(10); 
		System.out.println(s1.equals(s2));
		
	}
	

}
