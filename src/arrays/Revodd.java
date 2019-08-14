package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Revodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,5,6,7,8};
		int a1[]=new int[a.length];
		int e=1,d=a.length-1;
		for(int i=a.length-1;i>=1;i-=2,e+=2)
		{
			a1[e]=a[i];
		}
		for(int i=0;i<a.length;i+=2)
			a1[i]=a[i];
		System.out.println(Arrays.toString(a1));
	}

}
