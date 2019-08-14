package arrays;

public class Sumele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,3,5,3};
		int n=6;
		for(int i=0;i<a.length;i++)
		{
			boolean b=false;
			for(int j=i+1;j<a.length;j++)
			{
				
				if((a[i]+a[j])==n)
				{
					System.out.println(a[i]+" "+a[j]);
				}	
				
			}	
			
		}
		
	}

}
