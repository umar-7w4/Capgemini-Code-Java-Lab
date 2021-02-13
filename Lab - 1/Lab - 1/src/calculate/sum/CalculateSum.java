package calculate.sum;
import java.util.Scanner;


public class CalculateSum {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int answer = 0;
		for(int i=1;i<=input;i++) {
			if (i%3==0 || i%5==0) {
				answer+=i;
			}
		}
		System.out.println(answer);
		
	}

}

