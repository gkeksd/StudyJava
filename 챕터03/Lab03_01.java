import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input 5 positive numbers");
		int arr[] = new int[5];
		int max = 0;
		for(int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
			if(i == 0) max = arr[i];
			else {if(max < arr[i]) max = arr[i];}
		}
		System.out.println("Maximum number: " + max);
		scanner.close();
	}

}
