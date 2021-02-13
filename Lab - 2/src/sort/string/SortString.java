package sort.string;

import java.util.Scanner;
import java.util.Arrays;
public class SortString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 0;
		String a [] = new String[num];
		
		for(int i = 0;i<num;i++) {
			a[i] = sc.next();
		}
		Arrays.sort(a);
		
		if (num%2==0) {
			for(int j=0; j<(num/2);j++) {
				a[j] = a[j].toUpperCase();
			}
			for(int j = (num/2);j<num;j++) {
				a[j] = a[j].toLowerCase();
			}
		}
		else {
			for(int j=0; j<((num/2+1));j++) {
				a[j] = a[j].toUpperCase();
			}
			for(int j = ((num/2)+1);j<num;j++) {
				a[j] = a[j].toLowerCase();
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
}