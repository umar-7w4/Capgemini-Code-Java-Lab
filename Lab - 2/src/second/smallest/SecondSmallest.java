package second.smallest;

import java.util.Scanner;
import java.util.Arrays;
public class SecondSmallest {
	
	int temp;
	public void secondSort(int [] a) {
		
		for(int i = 0; i<a.length;i++) {
			for(int j = 0;j<(a.length-i-1); j++) {
				if(a[j]>a[j+1]) {
					 temp = a[j];
					 a[j] = a[j+1];
					 a[j+1] = temp;
				}
			}
		}
		System.out.println(a[a.length-2]);
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a[] = new int[num];
		
		for(int i = 0;i<num;i++) {
			a[i] = sc.nextInt();
		}
		SecondSmallest obj = new SecondSmallest();
		obj.secondSort(a);
		
	}
}