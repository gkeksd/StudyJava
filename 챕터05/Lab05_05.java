interface USB_4 {
	void readUSB();
	default void writeUSB() {
		System.out.println("Can't write to USB");
	}
}

interface USBA_4 extends USB_4 {
	void connectA();
}

interface USBC_4 extends USB_4 {
	void connectC();
}

class USBhub implements USB_4 {
	private USB_4[] device = new USB_4[3];
	private int i = 0;
	public void readUSB() {
		for(int i = 0; i < 2; i++) {
			System.out.print(((Device)device[i]).getName() + ": ");
			device[i].readUSB();
		}
	}
	public void writeUSB() {
		for(int i = 0; i < 2; i++) {
			System.out.print(((Device)device[i]).getName() + ": ");
			device[i].writeUSB();
		}
	}
	public void addDevice(USB_4 d) {
		device[i++] = d;
	}
}

abstract class Device {
	private String name;
	private int year;
	
	Device(String name, int year) {
		this.name = name; this.year = year;
	}
	protected String getName() {return name;}
	protected int getYear() {return year;}
	public abstract String getInfor();
}

class S22 extends Device implements USB_4, USBC_4 {
	private String price = "$1400"; private String s;
	public S22(String name, int year) {
		super(name, year);
	}
	public String getInfor() {
		String str;
		str = super.getName() + " " + super.getYear() + " " + price + "\n" + super.getName() + ": ";
		connectC();
		return str + s;
	}
	public void readUSB() {
		System.out.println("USB read");
	}
	public void writeUSB() {
		System.out.println("USB write");
	}
	public void connectC() {
		s = "USB-C connected";
	}
}

class MP3 extends Device implements USB_4, USBA_4 {
	private String price = "$120"; private String s;
	public MP3(String name, int year) {
		super(name, year);
	}
	public String getInfor() {
		String str;
		str = super.getName() + " " + super.getYear() + " " + price + "\n" + super.getName() + ": ";
		connectA();
		return str + s;
	}
	public void readUSB() {
		System.out.println("USB read");
	}
	public void connectA() {
		s = "USB-A connected";
	}
}

class TV extends Device {
	private String price = "$5000";
	public TV(String name, int year) {
		super(name, year);
	}
	public String getInfor() {
		String str;
		str = super.getName() + " " + super.getYear() + " " + price;
		return str;
	}
}


public class FirstProgram {
	static void printInfor(Device d) {
		System.out.println(d.getInfor());
		
	}
	public static void main(String[] args) {
		S22 s22 = new S22("S22", 2022);
		MP3 mp3 = new MP3("MP3", 2005);
		TV tv = new TV("TV", 2017);
		
		Device[] devices = new Device[] {s22, mp3, tv};
		USBhub hub = new USBhub();
		
		for(Device d : devices) {
			printInfor(d);
			if(d instanceof USB_4)
				hub.addDevice((USB_4)d);
		}
		
		System.out.println();
		hub.readUSB();
		System.out.println();
		hub.writeUSB();
	}

}