import java.util.Scanner;

public class class04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char arr[][] = new char[2][3];
		System.out.println("Enter 6 integers one by one\n> ");
		for(int i = 0; i < 2;) {
			for(int j = 0; j < 3;) {
				char a = scanner.next().charAt(0);
				if(a >= '0' & a <= '9') {
					arr[i][j] = a;
					j++;
				}
				else {
					System.out.println("Not an Integer!");
				}
			}
			i++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) System.out.print(arr[i][j] + " ");
			System.out.print("\n");
		}
		scanner.close();
	}

}
