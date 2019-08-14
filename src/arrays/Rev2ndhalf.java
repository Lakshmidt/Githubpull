package arrays;

import java.util.Arrays;

public class Rev2ndhalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,6,5,7,8,9};
		int a1[]=new int[a.length];
		int i=0;
		for(i=0;i<a.length/2;i++) 
		{
			a1[i]=a[i];
			System.out.print(a[i]+" ");
		}
		int k=i;
		for(i=a.length-1;i>=a.length/2;i--,k++) 
		{
			a1[k]=a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a1));
		System.out.println(); 
	}

}
