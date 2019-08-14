package arrays;

public class Sumofodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int e = 0, d = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				e += a[i];
			else
				d += a[i];
		}
		System.out.println("sum of even elements: " + e);
		System.out.println("sum of odd elements: " + d);
		// System.out.println(0277);
		
	}

}
