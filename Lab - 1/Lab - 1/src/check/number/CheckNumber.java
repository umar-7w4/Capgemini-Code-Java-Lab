package check.number;
import java.util.Arrays;
import java.util.Scanner;

public class CheckNumber {

	
	public static void main(String details[]) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String str1 = String.valueOf(input);
		char check1 [] = str1.toCharArray();
		Arrays.sort(check1);
		String str2 = new String(check1);
		if (str1.equals(str2)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}
}