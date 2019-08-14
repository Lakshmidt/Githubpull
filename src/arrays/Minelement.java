package arrays;

public class Minelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,5,2,3,1,9,10};
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
				
			}
		}
		System.out.println("min "+a[0]);
		System.out.println("max "+a[a.length-1]);
		System.out.println("2nd min "+a[1]);
		System.out.println("2nd max "+a[a.length-2]);
	}

}
