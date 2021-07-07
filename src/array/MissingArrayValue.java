package array;
import java.util.Arrays;
public class MissingArrayValue {

	public static void main(String[] args) {
		int a[]= {8,15,20,22,30};
		Arrays.sort(a);
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = a[i]+1; j < a[i+1]; j++) {
				System.out.println(j);
				
			}
			
		}

	}

}
