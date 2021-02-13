package check.power;

import java.util.Scanner;
public class CheckPower {


	public static void main(String details[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double value = Math.log(num);
		double log2_value = Math.log(2);
		double check = value/log2_value;
		if (check == (int)check) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}