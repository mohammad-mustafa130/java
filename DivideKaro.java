import java.util.Scanner;
class DivideKaro {
	public static void main(String... args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numerator: ");
		x = sc.nextInt();

		System.out.println("Enter Denominator: ");
		y = sc.nextInt();

		z = x / y;
		System.out.println(z);
	}
}
