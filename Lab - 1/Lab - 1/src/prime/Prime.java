package prime;
import java.util.Scanner;

public class Prime {
	
	static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=2;i<=input;i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

}
