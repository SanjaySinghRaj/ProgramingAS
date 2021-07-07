package array;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		int arr[]= {1,2,55,33,44,996,223,15,22,45,64};
		int evencount=0,oddcount=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evencount++;
				//System.out.println("even number"+arr[i]);
			}else {
				oddcount++;
				//System.out.println("Odd number"+arr[i]);
			}
			
		}
		int evenarr[]=new int[evencount];
		int oddarr[]=new int[oddcount];
		for (int i = 0,j=0,k=0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evenarr[j]=arr[i];
				j++;
				//System.out.println("even number"+arr[i]);
			}else {
				oddarr[k]=arr[i];
				k++;
				//System.out.println("Odd number"+arr[i]);
			}
			
			
		}
		for (int i = 0; i < evenarr.length; i++) {
			System.out.print(evenarr[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < oddarr.length; i++) {
			System.out.print(oddarr[i]+" ");
		}
	}

}
