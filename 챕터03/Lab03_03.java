import java.util.Scanner;

public class class01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input your message");
		System.out.println("q: quit the program");
		
		while(true) {
			System.out.print(">");
			String text = scanner.nextLine();
			System.out.println(text);
			if(text.equals("q"))
					break;
		}
		System.out.println("bye!");
		
		scanner.close();
	}

}
