package get.sorted;

import java.util.Scanner;
import java.util.Arrays;
public class GetSorted {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int a[] = new int[num];
		int b[] = new int[num];
		for(int i = 0;i<num;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<num;i++) {
			b[i] = a[num-(i+1)];
		}
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}
}