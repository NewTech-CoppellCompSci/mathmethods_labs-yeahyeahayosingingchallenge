package labs;

import java.util.Scanner;

public class Lab02 {

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

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * input1 + input2);
			System.out.println(num);

		}

	}

	public static void problem02() {

		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a radius:");
		int radius = inKey.nextInt();
		System.out.println("Enter a height:");
		int height = inKey.nextInt();

		int volume = ((22 * radius * radius * height) / 7);

		System.out.println("volume of Cylinder is: " + volume);

	}

	public static void problem03() {

		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter x1");
		int x1 = inKey.nextInt();
		System.out.println("Enter y1");
		int y1 = inKey.nextInt();
		System.out.println("Enter x2");
		int x2 = inKey.nextInt();
		System.out.println("Enter y2");
		int y2 = inKey.nextInt();

		double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		System.out.println("Distance between points = " + distance);
	}

	public static void problem04() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a-value: ");
		double a = input.nextDouble();
		System.out.print("Enter b-value: ");
		double b = input.nextDouble();
		System.out.print("Enter c-value: ");
		double c = input.nextDouble();

		double d = b * b - 4.0 * a * c;
		if (d > 0.0) {

			double x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
			double x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);

		}

	}

}
