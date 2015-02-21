import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Ax = scan.nextInt();
		int Bx = scan.nextInt();
		int Cx = scan.nextInt();
		int Ay = scan.nextInt();
		int By = scan.nextInt();
		int Cy = scan.nextInt();
		
		double area = (double)(Ax*(By-Cy) + Bx*(Cy-Ay) + Cx*(Ay-By)) / 2;
		
		if (area == 0) {
			System.out.println(0);
		}
		System.out.println(Math.abs((int)area));

	}

}
