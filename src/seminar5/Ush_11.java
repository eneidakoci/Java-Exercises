package seminar5;
import java.util.Scanner;
public class Ush_11 {
/*Ndërtoni një metodë statike public static double readDouble(String prompt) e cila i shfaq një String
përdoruesit, lexon numrin dhe më pas e kthen atë.
Për shembull:
paga = readDouble (“Ju lutem vendosni pagën”) ;*/
	
	public static double readDouble(String str) { 
		System.out.print(str+" ");
		Scanner in = new Scanner(System.in);
		double paga = in.nextDouble();
		return paga;
	}
	
	
	public static void main(String[] args) {
		double page = readDouble("Ju lutem vendosni pagen: ");
		System.out.println(page);
		
	}

}

