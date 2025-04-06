package project01;

class Device_2 {
	private String name;
	private int year;
	
	Device_2(String name, int year) {
		this.name = name; this.year = year;
	}
	public String getInfor() {
		return name + " " + year;
	}
}

class S22_2 extends Device_2 {
	public S22_2(String name, int year) {
		super(name, year);
	}
	public String getInfor() {
		return super.getInfor();
	}
}

class MP3_2 extends Device_2 {
	public MP3_2(String name, int year) {
		super(name, year);
	}
	public String getInfor() {
		return super.getInfor();
	}
	
}

class TV_2 extends Device_2 {
	public TV_2(String name, int year) {
		super(name, year);
	}
	public String getInfor() {
		return super.getInfor();
	}
	
}

public class Lab05_02 {
	static void printinfor(Device_2 d) {
		System.out.print(d.getInfor());
	}
	public static void main(String[] args) {
		S22_2 s22 = new S22_2("S22", 2022);
		MP3_2 mp3 = new MP3_2("MP3", 2005);
		TV_2 tv = new TV_2("TV", 2017);
		
		int price[] = new int[3];
		price[0] = 1400;
		price[1] = 120;
		price[2] = 5000;
		
		Device_2 device[] = new Device_2[3];
		device[0] = s22;
		device[1] = mp3;
		device[2] = tv;
		for(int i = 0; i < 3; i++) {
			printinfor(device[i]);
			System.out.println(" $" + price[i]);
		}
	}

}
