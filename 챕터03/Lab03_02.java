import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input 5 positive numbers");
		int arr[] = new int[5];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		System.out.println("Average: " + (float)sum / 5);
		scanner.close();
	}

}
