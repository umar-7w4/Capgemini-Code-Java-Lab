package modify.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModifyArray {
	
	static void reverse(int [] a) {
		int n = a.length;
		int s[] = new int[n];
		for(int i = 0;i<n;i++) {
			s[i] = a[n-(i+1)];
		}
		System.out.println(Arrays.toString(s));
	}
	
	public void removeDuplicateElements(int a[], int n){  
		Arrays.sort(a);
        if (n==0 || n==1){  
            System.out.println(0);
            return;
        }  
        
        int b[] = new int[n];
        int k = 0;
        for(int i = 0;i<n-1;i++) {
        	if (a[i]!=a[i+1]) {
        		b[k++] = a[i];
        	}
        }
        b[k++] = a[n-1];
        b = Arrays.copyOf(b,k);
        reverse(b);
	}
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   int a[] = new int[num];
	   for (int i = 0;i<num ;i++) {
		   a[i] = sc.nextInt();
	   }  
	   ModifyArray obj = new ModifyArray();
	   obj.removeDuplicateElements(a,num);
	   
   }   
}