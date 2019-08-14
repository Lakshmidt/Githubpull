package arrays;

import java.util.Arrays;

public class Reveven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,6,5,7,8,9,10},a1[]=new int[a.length];
		int l=a.length, e=0,d=0;
		for(int i=a.length-1;i>=0;i-=2,e+=2)
		{
			System.out.println(a[i]);
			a1[e]=a[i];
		}
		for(int i=1;i<a.length;i+=2)
		{
			a1[i]=a[i];
		}
		System.out.println(Arrays.toString(a1));
	}

}
