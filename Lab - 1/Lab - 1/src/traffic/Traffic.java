package traffic;
import java.util.Scanner;

public class Traffic {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		if (inp.equals("RED")) {
			System.out.println("STOP");
		}
		else  if (inp.equals("YELLOW")) {
			System.out.println("READY");
		}
		else  if (inp.equals("GREEN")){
			System.out.println("GO");
		}
		else {
			System.out.println("IN VALID INPUT");
		}
	}
}
