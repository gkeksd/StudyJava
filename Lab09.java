import java.io.*;
import java.util.*;
public class Lab09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		FileWriter fout = null;
		try {
			fout = new FileWriter("c:/test/test2.txt");
			String s = "";
			
			try
	        {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	            while(!((s = br.readLine()).equals("")))
	            {
	                fout.write(s, 0, s.length());
	                fout.write("\n");
	            }

	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
			
			
			fout.close();
		}
		catch(IOException e) {
			System.out.println("입력 오류");
		}
		
		FileReader fin = null;
		try {
			fin = new FileReader("c:/test/test2.txt");
			
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("출력 오류");
		}
		
	}

}
