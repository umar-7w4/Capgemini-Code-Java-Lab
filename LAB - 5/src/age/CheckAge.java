package age;
import java.util.Scanner;

class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}
public class CheckAge {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			if (age<15) {
				throw new MyException("Age is restricted to above 15");
			}
			else {
				System.out.println("Age is : "+age);
			}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
