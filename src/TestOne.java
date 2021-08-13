
public class TestOne {

	public static void main(String[] args) {
		
		{
	        // write your code in Java SE 8
			
			int A[]= {1,3,5};
	        int sum=0;

	        char ch[]=new char[A.length];

	        for(int i=0 ;i<A.length ;i++)
	        {
	                ch[i]=(char)A[i];
	        }

	    
	        for(int i=0 ;i<ch.length ;i++)
	        {
	            if(!(ch[i]>'6'&& ch[i]<'9'))
	            {
	                System.out.println(ch[i]);
	            }
	        }

	System.out.println(sum);
	    }
	}

}