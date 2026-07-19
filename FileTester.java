import java.io.*;
class FileTester {
	public static void main(String[] args) {
		String hm = System.getProperty("user.home");
		String fs = File.separator;
		String path = hm + fs + "fdir" + fs + "first.txt";
		File f = new File(path);
		try {
			//f.createNewFile();
			System.out.println("Readable: " +  f.canRead());
			System.out.println("Writable: " +  f.canWrite());
			System.out.println("Executable: " + f.canExecute());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
