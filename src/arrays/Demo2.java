package arrays;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'T','E','S','T'};
		for(int i=ch.length-1;i>=0;i--)
			System.out.println(ch[i]);
		String s="String";
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
			System.out.print(c[i]+" ");
	}

}
