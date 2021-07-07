package array;

public class SortArray {

	public static void main(String[] args) {
		int a[]= {2,5,6,9,8,4,6,3,88,7,4,66};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}

	}

}
