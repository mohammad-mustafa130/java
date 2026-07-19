import java.io.*;
import java.util.*;

class DisplayDemo {
	public static void main(String[] args) {
		String uh = System.getProperty("user.home");
		String sep = File.separator;

		File f2 = new File(uh + sep + "yourfile.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");

		try(FileWriter fos = new FileWriter(f2)) {
			String data;
			while(!(data = sc.nextLine()).equals("#")) {
				fos.write(data);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
