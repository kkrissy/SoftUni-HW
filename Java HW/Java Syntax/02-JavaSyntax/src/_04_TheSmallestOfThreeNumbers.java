import java.util.Scanner;


public class _04_TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = Double.parseDouble(input.next());
		double b = Double.parseDouble(input.next());
		double c = Double.parseDouble(input.next());
		double smallest = Math.min(a, Math.min(b, c));
		System.out.println(smallest);

	}

}
