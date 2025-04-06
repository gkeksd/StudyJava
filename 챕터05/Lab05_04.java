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

class S22_4 implements USB_4, USBC_4 {
	private String name;
	public S22_4(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void readUSB() {
		System.out.println("USB read");
	}
	public void writeUSB() {
		System.out.println("USB write");
	}
	public void connectC() {
		System.out.println("USB-C connected");
	}
}

class MP3_4 implements USB_4, USBA_4 {
	private String name;
	public MP3_4(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void readUSB() {
		System.out.println("USB read");
	}
	public void connectA() {
		System.out.println("USB-A connected");
	}
}

public class Lab05_04 {
	
	public static void connect(USB_4 u) {
        if (u instanceof S22_4) {
            System.out.print(((S22_4) u).getName() + ": ");
            ((S22_4) u).connectC();
        } else if (u instanceof MP3_4) {
            System.out.print(((MP3_4) u).getName() + ": ");
            ((MP3_4) u).connectA();
        }
    }
    
    public static void readUSB(USB_4 u) {
        if (u instanceof S22_4) {
            System.out.print(((S22_4) u).getName() + ": ");
        } else if (u instanceof MP3_4) {
            System.out.print(((MP3_4) u).getName() + ": ");
        }
        u.readUSB();
    }
    
    public static void writeUSB(USB_4 u) {
        if (u instanceof S22_4) {
            System.out.print(((S22_4) u).getName() + ": ");
            ((S22_4) u).writeUSB();
        } else if (u instanceof MP3_4) {
            System.out.print(((MP3_4) u).getName() + ": ");
            ((MP3_4) u).writeUSB();
        }
    }

	public static void main(String[] args) {
		S22_4 s22 = new S22_4("S22");
		MP3_4 mp3 = new MP3_4("MP3");

		USB_4[] hub = new USB_4[] {s22, mp3};
		for (USB_4 u : hub) {
			connect(u);
			readUSB(u);
			writeUSB(u);
		}
	}

}