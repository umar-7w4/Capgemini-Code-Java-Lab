package bank.account;
import java.util.Scanner;

abstract class Account{
	
    long accNum;
	double balance;
	
	public abstract long getAccNum();
	public abstract void setAccNum(long accNum);
	public abstract double getBalance();
}

class Person extends Account{
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name,int age, long accNum){
		this.name = name;
		this.age = age;
		this.accNum = accNum;
	}	
	@Override
	public long getAccNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setAccNum(long accNum) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class SavingsAccount extends Account {
	
	final double minimumBalance = 500;
	
	@Override
	public long getAccNum() {
		return accNum;
	}

	@Override
	public void setAccNum(long accNum) {
		this.accNum = accNum;	
	}

	@Override
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;		
	}
	
	public void withdraw(double amount) {
		if ((balance - amount)>=500) {
			balance = balance - amount;
		}
		else {
		System.out.println("Minimum balance of Rupees "+minimumBalance+" is requried");
	}
  }
}

class CurrentAccount extends Account{
	
	final double overdraft = 10000;

	@Override
	public long getAccNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAccNum(long accNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		if (amount>=10000) {
			System.out.println("Maximum amount that can be debited is : "+overdraft);
		}
	}	
}


public class BankAccount {
   public static void main(String[] args) {
	   SavingsAccount s = new SavingsAccount();
	   CurrentAccount c = new CurrentAccount();
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Name of the Account Holder : ");
	   String name = sc.nextLine();
	   System.out.println("Enter Age of the Account Holder : ");
	   int age = sc.nextInt();
	   System.out.println("Enter Account number of the Account Holder : ");
	   long accNum = sc.nextLong();
	   
	   System.out.println("--------------------------------------------------------");
	   
	   Person obj1 = new Person(name,age,accNum);
	   System.out.println("Enter the amount that you want to deposit : ");
	   double depositAmmount = sc.nextDouble();
	   s.deposit(depositAmmount);
	   System.out.println("Account Holder : "+obj1.getName());
	   System.out.println("Account Holder Age : "+obj1.getAge());
	   System.out.println("Account Number : "+obj1.getAccNum());
	   System.out.println("Account Balance : "+s.getBalance());
	   
	   System.out.println("--------------------------------------------------------");
	  
	   System.out.println("Enter the amount that you want to withdraw : ");
	   double withdrawAmount = sc.nextDouble();
	   
	   if (withdrawAmount >= 10000) {
		   c.withdraw(withdrawAmount);
		   System.out.println("Account Balance : "+s.getBalance());
	   }
	   else {
		   s.withdraw(withdrawAmount);
		   System.out.println("Account Balance : "+s.getBalance());
	  }
   }
}
