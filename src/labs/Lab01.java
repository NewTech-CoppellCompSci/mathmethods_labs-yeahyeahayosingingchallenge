package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {

		problem01();
		problem02();
		problem03();
		problem04();

	}

	public static void problem01() {

		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int input1 = inKey.nextInt();
		System.out.println("Enter another positive integer");
		int input2 = inKey.nextInt();

		double input1Pow = Math.pow(input1, input2);
		System.out.println(input1Pow);

	}

	public static void problem02() {

		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int input1 = inKey.nextInt();

		double yas = Math.sqrt(input1);
		System.out.print(yas);

	}

	public static void problem03() {

		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int leg1 = inKey.nextInt();
		System.out.println("Length of side A = " + leg1);

		System.out.println("Enter another positive integer");
		int leg2 = inKey.nextInt();
		System.out.println("Length of side B = " + leg2);

		double leg1Pow = Math.pow(leg1, 2);
		double leg2Pow = Math.pow(leg2, 2);

		double sum = leg1Pow + leg2Pow;

		System.out.println("Hypotenuse = " + sum);

	}

	public static void problem04() {

		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter an integer");
		int input1 = inKey.nextInt();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		if (input1 == 0)
			System.out.println("ok enter somethin else");

		else if (input1 != 0) {

			while (input1 != 0) {

				System.out.println("Enter an integer");
				input1 = inKey.nextInt(); 
				
				max = Math.max(max, input1);
				
				
				if (input1 == 0) {
				}
				
				min = Math.min(min, input1);
				
				
			}
			System.out.println("Max = " + max);
			System.out.println("Min = " + min);
		}
	}

}
