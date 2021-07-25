
public class PallidromeArray {

	public static void main(String[] args) {
		int digit=0,count=0, j=0;
		int num=digit;
		int a[]={1,2,1,2,3,2,1,2,1,};
		for(int i=0;i<a.length;i++)
		{
			count++;
			if(count<=3)
			{
			System.out.print(a[i]);
			digit=digit*10+a[i];
			}
			else{
				count=0;
				i=j;
				j++;
				System.out.println();
			}
			
			System.out.println(digit);
		}

	}

}
