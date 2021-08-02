package august02;

public class StringDemo {
	
	int id;
	String name;
	
	public StringDemo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
	@Override
	public String toString() {
		return "StringDemo id=" + id + ", name=" + name ;
	}


	public static void main(String[] args) {
		StringDemo d1 = new StringDemo(20,"hello");
		System.out.println(d1);
		System.out.println(d1.toString());
	}

}
