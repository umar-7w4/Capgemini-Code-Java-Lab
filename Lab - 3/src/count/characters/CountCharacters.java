package count.characters;


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountCharacters {

   public static void main(String[] args) {
	   /*
	    * At this time we do not have knowledge of java files 
	    * Java files topics is schedules in comming section
	    * so this program prints only no of characters
	    */
	   Scanner sc = new Scanner(System.in);
	   String a = sc.nextLine();
	   String b[] = a.split(" ");
	   int x = b.length;
	   String ans = "";
	   for(int i = 0;i<x;i++) {
		   ans+=b[i];
	   }
	   System.out.println(ans.length());
   }   
}