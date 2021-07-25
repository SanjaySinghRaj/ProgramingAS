import java.util.Iterator;

public class PAlindromArray {

	public static void main(String[] args) {
		
		int count=0;
		
		
		int i1=0;
		
		int a[]={1,2,1,2,3,2,1,2,1};
		for(int i=0;i<a.length;i++)
		{
			String s1="";
			
		for (int j = i; j < i+3 && j <a.length; j++)
		{
			
			s1=s1+a[j];
			
			
		}
			i1=	Integer.parseInt(s1);
			
			pali(i1);
			
			count++;
			
			if(count==7)
			{
				break;
			}
			
		}		

	}
	
	public static void pali(int a)
	{
		int temp=a;
		int rev=0;
		while(a!=0)
		{
		
			int digit=a%10;
			rev=rev*10+digit;
			a=a/10;	
			
		}
		
		if(temp==rev)
		{
		System.out.println(rev);
		}
		
		
	}

}
