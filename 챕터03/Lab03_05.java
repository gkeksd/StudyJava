import java.util.Scanner;

public class FirstProgram {
	static int[][] makeArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input 8 positive numbers");
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		return arr;
	}

	public static void main(String[] args) {
		int[][] intArray = makeArray();
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
