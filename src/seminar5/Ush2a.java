package seminar5;
import java.util.Scanner;
public class Ush2a {
/*Ndërtoni një metodë që merr si parametër një numër dhe kthen
a. Shifrën e parë*/
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Jepni 1 numer:");	
		int numri=scan.nextInt();
		
		System.out.println("Shifra e pare e numrit eshte :"+shifra1(numri));
scan.close();
	}

	
	
	
	public static int shifra1(int n) {
		while(n>=10) {
			n=n/10;
		}
		return n;
	}
}
