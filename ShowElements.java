import java.util.Scanner;
class ShowElements {
	public static void main(String... args) {
		int[] arr = {5,10,2,8,15,17,39,6};
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter no. of elements to be processed: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println(++arr[i]);
		}
	}
}
