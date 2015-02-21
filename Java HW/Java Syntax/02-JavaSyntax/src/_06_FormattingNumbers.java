import java.util.Scanner;


public class _06_FormattingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		String aToHex = Integer.toHexString(a).toUpperCase();
		String aToBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ','0');
		
		if (c%1 == 0) {
			System.out.printf("|%-10s|%s|%10.2f|%-10.0f",aToHex,aToBinary,b,c);
		} else {
            System.out.printf("|%-10s|%s|%10.2f|%-10.3f",aToHex,aToBinary,b,c);
		}
	}
}
