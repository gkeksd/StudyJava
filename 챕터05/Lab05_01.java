class People {
	private String name;
	private String num;
	public String getName() {
		return name;
	}
	public String getSsn() {
		return num;
	}
	People(String name, String num) {
		this.name = name;
		this.num = num;
	}
}

class Student extends People {
	private int stNum;
	Student(String name, String num, int stNum) {
		super(name, num);
		this.stNum = stNum;
	}
	public int getId() {
		return stNum;
	}
}

public class Lab05_01 {
	public static void main(String[] args) {
		Student s = new Student("wjdwnsry", "031105-3xxxxxx", 12230678);
		System.out.println("name: " + s.getName());
		System.out.println("ssn: " + s.getSsn());
		System.out.println("id: " + s.getId());
	}

}
