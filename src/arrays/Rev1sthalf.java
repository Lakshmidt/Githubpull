package arrays;

import java.util.Arrays;

public class Rev1sthalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,6,5,7,8,9},a1[]=new int[a.length];
		int t=0;
		for(int i=0;i<a.length;i++) 
		{

			if(i<(a.length/2)-1)
			{
			t=a[i];
			a[i]=a[i+1];
			a[i+1]=t;
			}
			System.out.print(a[i]+" ");
			a1[i]=a[i];
		}
		System.out.println();
		System.out.println(Arrays.toString(a1));
		
	}

}
