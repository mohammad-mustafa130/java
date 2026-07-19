import java.io.*;
import java.util.*;

class CopyImage {
	public static void main(String[] args) {
		String uh = System.getProperty("user.home");
		String sep = File.separator;
		byte[] mem = new byte[1024];

		File f1 = new File(uh + sep + "Downloads" + sep + "Alisha pic.jpeg");
		File f2 = new File(uh + sep + "Pictures" + sep + "copiedpic.jpeg");

		try(
			FileInputStream fis = new FileInputStream(f1); 
			FileOutputStream fos = new FileOutputStream(f2)) {

			BufferedInputStream bis = new BufferedInputStream(fis, 1024);
			BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);

			int data;
			while((data = bis.read(mem, 0, 1024)) != -1) {
				bos.write(mem, 0, 1024);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
