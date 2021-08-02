package august02;

import java.util.Objects;

public class HasecodeDemo {
	static int count=0;
	int eid;
	
	public HasecodeDemo()
	{
		count++;
		eid=count;
	}

	@Override
	public int hashCode() {
		return eid;
	}


	

	public static void main(String[] args) {
		HasecodeDemo h1 = new HasecodeDemo();
		System.out.println(h1.hashCode());
		HasecodeDemo h2 = new HasecodeDemo();
		System.out.println(h2.hashCode());
		HasecodeDemo h3 = new HasecodeDemo();
		System.out.println(h3.hashCode());

	}

}
