package name;
import java.util.Scanner;

class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}

public class ValidateName{
	
	public static boolean isNullOrEmpty(String str) {
	    if(str != null && !str.isEmpty())
	        return false;
	    return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		try {
			if (isNullOrEmpty(firstName)) {
				throw new MyException("Please input valid first name");
			}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		try {
			if (isNullOrEmpty(lastName)) {
				throw new MyException("Please input valid last name");
			}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		if (!isNullOrEmpty(firstName) && !isNullOrEmpty(lastName)) {
			System.out.println(firstName+" "+lastName);
		}	
	}
}