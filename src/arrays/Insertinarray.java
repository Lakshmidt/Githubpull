package arrays;

import java.util.Arrays;

public class Insertinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=2;
		int a[]= {9,8,4,6,7};
		int a1[]=new int[a.length+1];
		System.out.println(a1.length);
		/*int i=0;
		while(i<2)
		{
			a1[i]=a[i];
			i++;
		}
		a1[2]=3;
			
		for(i=3;i<a1.length;i++)
		{
			a1[i]=a[i-1];
		}
		System.out.println(Arrays.toString(a1));*/
		for(int i=0;i<a1.length;i++)
		{
			if(i<2)
				a1[i]=a[i];
			else if(i==2)
				a1[2]=t;
			else
			{
				a1[i]=a[i-1];
			}
		}
		System.out.println(Arrays.toString(a1));
	}

}
