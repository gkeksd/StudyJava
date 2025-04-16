import java.util.Vector;
import java.util.Iterator;

class Point {
	private int x, y;
	Vector<Integer> v = new Vector<Integer>();
	
	Point(int x, int y) {
		this.x = x; this.y = y;
		v.add(this.x);
		v.add(this.y);
	}
	
	
	void PrintVector() {
		Iterator<Integer> it = v.iterator();
		System.out.print("(");
		while(it.hasNext()) {
			int n = it.next();
			System.out.print(n);
			if(it.hasNext()) {
				System.out.print(",");
			}
		}
		System.out.println(")");
	}
}

public class Lab07 {

	public static void main(String[] args) {
		Point p1 = new Point(5, 16);
		p1.PrintVector();
		Point p2 = new Point(2, 12);
		p2.PrintVector();
		Point p3 = new Point(11, 4);
		p3.PrintVector();
	}

}
