import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _08_SortArrayOfStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] city = new String[n];
		for (int i = 0; i < n; i++) {
			city[i] = input.next();
		}
		Arrays.sort(city);
		for (int i = 0; i < city.length; i++) {
			System.out.println(city[i]);
		}
	}

}
