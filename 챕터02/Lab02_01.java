//package practice01;
import java.util.Scanner;
public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.print("age: ");
		int age = a.nextInt();
		
		a.nextLine();
		System.out.print("name: ");
		String name = a.nextLine();
		
		System.out.println(age + " " + name);
		
		a.close();
	}

}
