package array;

public class ArrayInsertionSort {

	public static void main(String[] args) {
		int arr[]= {1,2,55,33,44,996,223,15,22,45,64};
		for (int i = 0; i < arr.length-1; i++) {
			int min_index=i;
			int min_value=arr[i];			
			for (int j = i+1; j < arr.length; j++) {
				if(min_value>arr[j]) {
					min_index=j;
					min_value=arr[j];
				}
				
				}
			if(min_index!=i) {
				int temp=arr[i];
				arr[i]=arr[min_index];
				arr[min_index]=temp;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}

}
