package seminar5;
import java.util.Scanner;
public class Ush_8 {
	/*Përdoni rekursionin për të implementuar një metodë public static boolean find(String str, String
match) që teston nëse stringu match ndodhet në string.
boolean b = find("Mississippi", "sip"); / b do të ketë vlerën true
Nëse stringu fillon me match, atëherë programi ka përfunduar. Nëse jo, filloni përsëri kontrollonin
duke hequr karakterin e parë në fjalë.*/
	
	//metoda qe gjen nqs nje fjale eshte substring i nje fjale tjeter
	public static boolean find(String str, String match) { 
		if(str.startsWith(match) == true) {
			return true;
		} 
		if(str.length() < match.length()) { 
			return false;
		}
		String sub = str.substring(1,str.length());
		return find(sub,match);

	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Jepni nje string:");
		String s1 = in.next();
		System.out.print("Jepni nje string tjeter:");
		String s2 = in.next();
		boolean check = find(s1,s2);
		System.out.print(check);
		in.close();
	}
	
	
}
