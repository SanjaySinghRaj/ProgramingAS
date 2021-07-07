package array;

public class SearchArrayIndex {

	public static void main(String[] args) {
		int a[]= {1,5,8,6,3,1,47,8};
		int value=4;
		int result=search(a,value);
		if(result>=0) {
			System.out.println(value+" Index Is "+result);
		}
		else {
			System.out.println("Element Not Found");
		}

	}

	public static int search(int[] a, int value) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==value) {
				return  i;
			}
			
			
				
			
		}
		return -1;
		
	}
	

}
