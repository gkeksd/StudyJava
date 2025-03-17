import java.util.Scanner;
public class FirstProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Coordinates of a point (x, y): ");
		int xP = scanner.nextInt();
		int yP = scanner.nextInt();
		
		if(xP >= 100 & xP <= 200 & yP >= 100 & yP <= 200) {
			System.out.println("(" + xP + ", " + yP + "): inside the rectangle");
		}
		else {
			System.out.println("(" + xP + ", " + yP + "): not in the rectangle");
		}
		
		scanner.close();
	}

}
