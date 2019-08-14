package arrays;

public class Maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,5,2,3,1,9,10};
		int t=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(t<a[i])
			t=a[i];	
		}
		System.out.println("Max element "+t);
	}

}
