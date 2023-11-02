package seminar5;
import java.util.Scanner;
public class Ush_8 {
	/*P�rdoni rekursionin p�r t� implementuar nj� metod� public static boolean find(String str, String
match) q� teston n�se stringu match ndodhet n� string.
boolean b = find("Mississippi", "sip"); / b do t� ket� vler�n true
N�se stringu fillon me match, at�her� programi ka p�rfunduar. N�se jo, filloni p�rs�ri kontrollonin
duke hequr karakterin e par� n� fjal�.*/
	
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
