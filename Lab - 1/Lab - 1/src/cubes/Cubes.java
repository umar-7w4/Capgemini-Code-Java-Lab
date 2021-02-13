package cubes;
import java.util.Scanner;

public class Cubes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int ans = 0;
		int d = 1;
		while(d>0) {
			d = inp%10;
			ans+=(d*d*d);
			inp = inp/10;	
		}
		System.out.println(ans);
	}
}
