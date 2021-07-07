package array;

public class EqualArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		int count=0;
		if(a.length==b.length) {
			System.out.println("Array length is Equal");
			for (int i = 0; i < a.length; i++) {
				if(a[i]==b[i]) {
					count++;
					 }	
				}	
		    if(a.length==count) {
		        System.out.println(" Array value is Equal");
		
	            }
	             else {
		          System.out.println(" Array value is Not Equal");
		       }
		} 
			
		else {
			System.out.println("Array length is Not Equal");
		}
					

	}

}
