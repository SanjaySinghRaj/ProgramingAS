package array;

public class ZigzagArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		int c[]=new int[a.length+b.length];
		for (int i = 0,j=0,k=0; i < c.length; i++) {
			if(i%2==0) {
				c[i]=a[j];
				j++;
			}
			else {
				c[i]=b[k];
				k++;
			}
			
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
