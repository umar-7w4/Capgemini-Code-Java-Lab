package com.cg.eis.exception;
import java.util.Scanner;

class EmployeeException extends Exception {
	
	EmployeeException(String s){
		super(s);
	}
}

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		try {
			if (salary<3000) {
				throw new EmployeeException("Warning : Salary is below 3000");
			}
			else {
				System.out.println("Salary : "+salary);
			}
		}
		catch(EmployeeException e) {
			System.out.println(e.getMessage());
	}
  }
}
