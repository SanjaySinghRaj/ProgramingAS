package august12;

import java.util.HashMap;
import java.util.Map;

public class MapOne {
	public static void main(String[] args) {
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		h1.put(1, "hello");
		h1.put(2, "Sanjay");
		h1.put(3, "ram");
		h1.put(1, null);
		System.out.println(h1);
		System.out.println(h1.get(2));
		for (Map.Entry m  :h1.entrySet()) {
			System.out.println(m.getKey()+"   "+m.getValue());
		}
	}

}
