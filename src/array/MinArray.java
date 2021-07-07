package array;

public class MinArray {

	public static void main(String[] args) {
		int arr[]= {1,2,55,33,44,996,223,15,22,45,64};
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
