package calculate.difference;
import java.util.Scanner;

public class CalculateDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int squareSum = 0;
		int naturalSum = 0;
		for(int i = 1;i<=input;i++) {
			squareSum+=(i*i);
			naturalSum+=i;
		}
		System.out.println(squareSum-(naturalSum*naturalSum));
	}
}
