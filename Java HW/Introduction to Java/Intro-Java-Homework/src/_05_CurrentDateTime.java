import java.time.LocalDateTime;


public class _05_CurrentDateTime {

	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
		System.out.printf("Today is: %1$tD.%1$tM.%1$tY", current);
	}
}
