package arrays;

import java.util.Scanner;

public class Indexofele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,7,9,8,3,4,1,2};
		boolean b=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				b=true;
				break;
			}
		}
		if(!b)
			System.out.println(n+" is not present");
		else
			System.out.println(i+" is the index");
		
	}

}
