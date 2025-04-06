import java.util.Scanner;

abstract class Stack {
	public abstract int length();
	public abstract int capacity();
	public abstract String pop();
	public abstract boolean push(String str);
}

class StringStack extends Stack {
	int tos, N;
	String[] str;
	StringStack(int cp) {
		N = cp;
		tos = -1;
		str = new String[N];
	}
	public boolean empty() {
		return length() == 0;
	}
	public int length() {
		return tos + 1;
	}
	public int capacity() {
		return N;
	}
	public String pop() {
		if(empty()) {
			return null;
		}
		return str[tos--];
	}
	public boolean push(String str) {
		if(length() >= capacity()) {
			System.out.println("Stack is Full!");
			return false;
		}
		this.str[++tos] = str;
		return true;
	}
}

public class FirstProgram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int capacity;
		String str;
		boolean b = true;
		System.out.print("size of stack: ");
		capacity = s.nextInt();
		s.nextLine();
		StringStack sst = new StringStack(capacity);
		
		while(b) {
			System.out.print("input: ");
			str = s.nextLine();
			if(str.equals("exit")) {
				System.out.print("pop all strings: ");
				String temp;
				while((temp = sst.pop()) != null) {
					System.out.print(temp + " ");
				}
				b = false;
			}
			
			sst.push(str);
		}
	}

}