package arrays;

import java.util.Arrays;

public class Rightshift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,5,6,8,7,9,1,10};
		int a1[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				a1[0]=a[a.length-1];
			}
			for(int j=i+1;j<a.length;j++)
			{
				a1[j]=a[i];
			}
		}
		a=a1;
		System.out.println(Arrays.toString(a));
		
	}


}
