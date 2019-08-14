package arrays;

public class Minarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,5,2,3,1,9,10};
		int t=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<t)
			t=a[i];	
		}
		System.out.println("Min element "+t);
	}

}
