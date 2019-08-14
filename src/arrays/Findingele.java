package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Findingele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5,7,8,4,3,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index of 1st element");
		int n1=sc.nextInt();
		System.out.println("enter the index of 2nd element");
		int n2=sc.nextInt();
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			t=a[n1];
			a[n1]=a[n2];
			a[n2]=t;
		}
		System.out.println(Arrays.toString(a));
	}

}
