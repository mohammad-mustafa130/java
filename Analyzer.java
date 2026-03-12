package mypkg;
import java.lang.reflect.Modifier;
public class Analyzer {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Correct Usage: java<classname><classname2>");
		} else {
			Class cl = null;
			try {
				cl = Class.forName(args[0]);
			} catch(Exception e) {
				e.printStackTrace();
			}
			String modifiers = Modifier.toString(cl.getModifiers());
			System.out.println(modifiers + " ");

			if(cl.isEnum()) {
				System.out.println("enum " + cl.getName());
			} else if(cl.isRecord()) {
				System.out.println("record " + cl.getName());
			} else if(cl.isInterface()) {
				System.out.println("interface " + cl.getName());
			} else {
				System.out.println("class " + cl.getName());
			}
		}
	}
}
