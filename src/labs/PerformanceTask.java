package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {

		Scanner inKey = new Scanner(System.in);

		double launchVel;
		double launchAng;
		double time = 0;
		double xPos;
		double yPos;

		System.out.println("Enter launch velocity (m/s) >>> ");
		launchVel = inKey.nextDouble();

		System.out.println("Enter launch angle (degrees) >>> ");
		launchAng = inKey.nextDouble();
		
		System.out.println("Projectile's path: \n");

		while (time < 100) {

			xPos = Math.cos(Math.toRadians(launchAng)) * time * launchVel;
			yPos = Math.sin(Math.toRadians(launchAng)) * time * launchVel - 0.5 * 9.8 * Math.pow(time, 2);

			if (yPos < 0) {
				yPos = 0;
			}

			System.out.println("Time: " + time + "m");
			System.out.println("  X-pos: " + xPos + "m");
			System.out.println("  Y-pos: " + yPos + "m");

			if (yPos == 0 && time > 0) {
				break;
			}

			time++;
		}

	}

}
