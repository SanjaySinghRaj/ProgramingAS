package August03;

public class CloneObj implements Cloneable{
int a;
String name;
	
	
	public CloneObj(int a,String name) {
		
		this.a = a;
		this.name=name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneObj c1=new CloneObj(10,"Ashish");
		System.out.println(c1.a);
		System.out.println(c1.name);
		
		CloneObj c2=(CloneObj)c1.clone();
		System.out.println(c2.a);
		System.out.println(c2.name);

	}

}
