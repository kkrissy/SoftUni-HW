import java.util.Scanner;


public class _05_DecimalToHex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String hex = Integer.toHexString(num);
		System.out.println(hex.toUpperCase());
	}
}
