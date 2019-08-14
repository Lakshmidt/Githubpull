package arrays;

import java.util.Arrays;

public class Insertarrayinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,8,9};
		int a1[]= {4,5,6,7};
		int a2[]=new int[a.length+a1.length];
		int e=0,n=0;
		for(int i=0;i<a2.length;i++)
		{
			if(i<=2)
			{
				a2[i]=a[i];
				e++;
			}
			else if(i>2 && i<=(a1.length)+2)
			{
				a2[i]=a1[n];
				n++;
			}
			else 
			{
				a2[i]=a[e];
				e++;
			}
		}
		System.out.println(Arrays.toString(a2));
	}

}
