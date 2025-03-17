//package project01;

import java.util.Scanner;
public class Program04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Center of circle: ");
		float cX = scanner.nextFloat();
		float cY = scanner.nextFloat();
		
		System.out.print("Radius: ");
		float rad = scanner.nextFloat();
		
		System.out.print("Point: ");
		float pX = scanner.nextFloat();
		float pY = scanner.nextFloat();
		
		if(Math.sqrt((pX - cX) * (pX - cX) + (pY - cY) * (pY - cY)) > rad) {
			System.out.println("("+pX+", "+pY+"): not in the circle");
		}
		else {
			System.out.println("("+pX+", "+pY+"): inside the circle");
		}
		
		scanner.close();
	}

}
