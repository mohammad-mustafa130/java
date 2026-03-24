package mypkg;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

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

			if(cl.isSealed()) {
				System.out.println("sealed" + cl.getName());
			}
			if(cl.isEnum()) {
				System.out.println("enum " + cl.getName());
			} else if(cl.isRecord()) {
				System.out.println("record " + cl.getName());
			} else if(cl.isInterface()) {
				System.out.println("interface " + cl.getName());
			} else {
				System.out.println("class " + cl.getName());
			}

			Class supercl = cl.getSuperclass();
			if(supercl != null && supercl != Object.class) {
				System.out.print("extends " + supercl.getName());
			}
			printInterfaces(cl);
			printPermittedSubclasses(cl);
			System.out.println(" {");

			printConstructors(cl);
			System.out.println();

			printMethods(cl);
			System.out.println();

			printFields(cl);
			System.out.println("}");
		}
	}
	public static void printPermittedSubclasses(Class cl) {
		if(cl.isSealed()) {
			Class<?>[] permittedSubclasses = cl.getPermittedSubclasses();
			for(int i = 0; i < permittedSubclasses.length; i++) {
				if(i == 0) {
					System.out.println(" permits ");
				} else {
					System.out.println(", ");
				}
				System.out.println(permittedSubclasses[i].getName());
			}
		}
	}
	public static void printFields(Class cl) {
		Field[] fields = cl.getDeclaredFields();
		for(int i = 0; i < fields.length; i++) {
			Class type = fields[i].getType();
			String name = fields[i].getName();
			System.out.print(" ");

			String modifiers = Modifier.toString(fields[i].getModifiers());
			if(modifiers.length() > 0) System.out.print(modifiers + " ");

			System.out.println(type.getName() + " " + name + ";");
		}
	}
	public static void printInterfaces(Class cl) {
		Class<?>[] interfaces = cl.getInterfaces();
		for(int i = 0; i < interfaces.length; i++) {
			if(i == 0) {
				System.out.print(cl.isInterface() ? "extends" : " implements ");
			} else {
				System.out.print(", ");
			}
			System.out.print(interfaces[i].getName());
		}
	}
	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getDeclaredConstructors();
		for(int i = 0; i < constructors.length; i++) {
			String name = constructors[i].getName();
			System.out.print(" ");

			String modifiers = Modifier.toString(constructors[i].getModifiers());
			if(modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(name + "(");

			Class[] paramTypes = constructors[i].getParameterTypes();
			for(int j = 0; j < paramTypes.length; j++) {
				if(j > 0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
	public static void printMethods(Class cl) {
		Method[] methods = cl.getDeclaredMethods();
		for(int i = 0; i < methods.length; i++) {
			Class retType = methods[i].getReturnType();
			String name = methods[i].getName();
			System.out.print(" ");

			String modifiers = Modifier.toString(methods[i].getModifiers());
			if(modifiers.length() > 0 ) System.out.print(modifiers + " ");
			System.out.print(retType.getName() + " " + name + "(");

			Class[] paramTypes = methods[i].getParameterTypes();
			for(int j = 0; j < paramTypes.length; j++) {
				if(j > 0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
}
